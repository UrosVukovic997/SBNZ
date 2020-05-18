package sbnz.integracija.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.SampleAppService;
import sbnz.integracija.example.dto.GlavnaStanicaDTO;
import sbnz.integracija.example.model.GlavnaStanica;
import sbnz.integracija.example.service.GlavnaStanicaService;

@RestController
@RequestMapping("gs")
public class GlavnaStanicaController {

	private final SampleAppService sampleService;

	@Autowired
	public GlavnaStanicaController(SampleAppService sampleService) {
		this.sampleService = sampleService;
	}
	
	@Autowired
	private GlavnaStanicaService glavnaStanicaService;
	
	@RequestMapping(value = "/all",method = RequestMethod.GET, produces = "application/json")
	public GlavnaStanicaDTO getGS() {
			GlavnaStanica  gStanica = glavnaStanicaService.getGlavnaStanica().get(0);	
		GlavnaStanica gs =glavnaStanicaService.save(sampleService.getClassifiedGlavnaStanica(gStanica));
		
		return new GlavnaStanicaDTO(gs);
	}
}
