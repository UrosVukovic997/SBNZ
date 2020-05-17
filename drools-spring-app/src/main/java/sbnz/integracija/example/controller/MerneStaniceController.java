package sbnz.integracija.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbnz.integracija.example.service.MernaStanicaService;

import sbnz.integracija.example.model.MernaStanica;

@RestController
@RequestMapping("ms")
public class MerneStaniceController {

	@Autowired
	private MernaStanicaService mernaStanicaService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<MernaStanica> getAll() {

		return mernaStanicaService.getAll();
	}
	
	@RequestMapping(value = "/dodaj", method = RequestMethod.POST, produces = "application/json")
	public void dodaj(@RequestBody MernaStanica mernaStanica) {
		
		mernaStanicaService.save(mernaStanica);
		
	}
}
