package sbnz.integracija.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import sbnz.integracija.example.service.GlavnaStanicaService;
import sbnz.integracija.example.service.MernaStanicaService;
import sbnz.integracija.example.SampleAppService;
import sbnz.integracija.example.dto.MernaStanicaDTO;
import sbnz.integracija.example.model.GlavnaStanica;
import sbnz.integracija.example.model.MernaStanica;

@RestController
@RequestMapping("ms")
public class MerneStaniceController {

	private final SampleAppService sampleService;

	@Autowired
	public MerneStaniceController(SampleAppService sampleService) {
		this.sampleService = sampleService;
	}
	
	@Autowired
	private MernaStanicaService mernaStanicaService;
	
	@Autowired
	private GlavnaStanicaService glavnaStanicaService;
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<MernaStanicaDTO> getAll() {
		List<MernaStanica> mernaStanicas = sampleService.getClassifiedMernaStanica(mernaStanicaService.getAll());
		mernaStanicaService.saveAll(mernaStanicas);
		List<MernaStanicaDTO> mernaStanicaDTOs = new ArrayList<MernaStanicaDTO>();
		for(MernaStanica ms : mernaStanicas) {
			mernaStanicaDTOs.add(new MernaStanicaDTO(ms));
		}
		
		return mernaStanicaDTOs;
	}
	
	@RequestMapping(value = "/dodaj", method = RequestMethod.POST, consumes = "application/json")
	public void dodaj(@RequestBody MernaStanicaDTO mernaStanicaDTO) {
		MernaStanica mernaStanica = new MernaStanica(mernaStanicaDTO.getRedniBroj(), mernaStanicaDTO.getNaziv(), mernaStanicaDTO.getLokacija(),
				mernaStanicaDTO.getNivoVode(), mernaStanicaDTO.getMaxNivo(), mernaStanicaDTO.getPadavine(), true);
		mernaStanicaService.save(mernaStanica);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	public void update(@PathVariable("id") Integer id, @RequestBody MernaStanicaDTO mernaStanicaDTO) {
		MernaStanica mernaStanica = mernaStanicaService.findById(id);
		mernaStanica.setNivoVode(mernaStanicaDTO.getNivoVode());
		mernaStanica.setPadavine(mernaStanicaDTO.getPadavine());
		mernaStanicaService.save(mernaStanica);
		GlavnaStanica.setInstance(glavnaStanicaService.getGlavnaStanica().get(0));
		sampleService.getClassifiedGlavnaStanica();
		
	}
	
	
}
