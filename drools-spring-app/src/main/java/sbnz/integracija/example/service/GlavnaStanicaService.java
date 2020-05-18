package sbnz.integracija.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.model.GlavnaStanica;
import sbnz.integracija.example.repository.GlavnaStanicaRepository;

@Service
public class GlavnaStanicaService {
	
	
	@Autowired
	private GlavnaStanicaRepository glavnaStanicaRepository;
	
	public List<GlavnaStanica> getGlavnaStanica() {
		return glavnaStanicaRepository.findAll();
	}
	
	public GlavnaStanica save(GlavnaStanica glavnaStanica) {return glavnaStanicaRepository.save(glavnaStanica);}
}
