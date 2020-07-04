package sbnz.integracija.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.SampleAppService;
import sbnz.integracija.example.dto.GlavnaStanicaDTO;
import sbnz.integracija.example.dto.PrognozaDTO;
import sbnz.integracija.example.model.GlavnaStanica;
import sbnz.integracija.example.model.VremenskaPrognoza;
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
			GlavnaStanica.setInstance(gStanica);
			System.out.println("nivo vode: "+gStanica.getNivoVode() + "stanje: "+ gStanica.getStanje());
		GlavnaStanica gs =glavnaStanicaService.save(sampleService.getClassifiedGlavnaStanica());
		
		return new GlavnaStanicaDTO(gs);
	}
	
	@RequestMapping(value = "/prognoza",method = RequestMethod.POST, consumes = "application/json")
	public PrognozaDTO postPrognoza(@RequestBody String redni) {
			GlavnaStanica  gStanica = glavnaStanicaService.getGlavnaStanica().get(0);	
			VremenskaPrognoza vp = gStanica.getMojaPrognoza();
			PrognozaDTO prognozaDTO = new PrognozaDTO();
			System.out.println(redni);
			String[] r = redni.split(":");
			String s = r[1].substring(1,2);
			System.out.println(s);
			if(s.equals("3"))
			{
				gStanica.setMojaPrognoza(vp.RED);
				prognozaDTO.setMojaPrognoza(vp.RED);
			} else if (s.equals("2"))
			{
				gStanica.setMojaPrognoza(vp.ORANGE);
				prognozaDTO.setMojaPrognoza(vp.ORANGE);
			} else if (s.equals("1"))
			{
				gStanica.setMojaPrognoza(vp.YELLOW);
				prognozaDTO.setMojaPrognoza(vp.YELLOW);
			} else {
				gStanica.setMojaPrognoza(vp.GREEN);
				prognozaDTO.setMojaPrognoza(vp.GREEN);
			}
			
			GlavnaStanica gs =glavnaStanicaService.save(sampleService.getClassifiedGlavnaStanica());
			
		
		return prognozaDTO;
	}
}
