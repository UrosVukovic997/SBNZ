package sbnz.integracija.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbnz.integracija.example.model.MernaStanica;

import sbnz.integracija.example.repository.MernaStanicaRepository;

@Service
public class MernaStanicaService {
	
	@Autowired
	private MernaStanicaRepository mernaStanicaRepository;
	
	public List<MernaStanica> getAll(){
		return mernaStanicaRepository.findAll();
	}
	
	public void save(MernaStanica mernaStanica) { mernaStanicaRepository.save(mernaStanica);}
}
