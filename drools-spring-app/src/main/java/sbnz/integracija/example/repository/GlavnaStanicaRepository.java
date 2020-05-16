package sbnz.integracija.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.model.GlavnaStanica;

public interface GlavnaStanicaRepository extends JpaRepository<GlavnaStanica, Long> {

}
