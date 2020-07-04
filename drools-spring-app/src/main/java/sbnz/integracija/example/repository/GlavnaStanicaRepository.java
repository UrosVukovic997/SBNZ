package sbnz.integracija.example.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sbnz.integracija.example.model.GlavnaStanica;


@Repository
public interface GlavnaStanicaRepository extends JpaRepository<GlavnaStanica, Long> {
	
	
	
	List<GlavnaStanica> findAll();
	
}
