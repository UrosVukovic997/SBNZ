package sbnz.integracija.example.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sbnz.integracija.example.model.MernaStanica;
@Repository
public interface MernaStanicaRepository extends JpaRepository<MernaStanica, Long> {

	
	@Query("select ms from MernaStanica ms where ms.aktivna = false")
    List<MernaStanica> pronadjiNeAktivne();
	
	List<MernaStanica> findAll();
	
	Optional<MernaStanica> findByRedniBroj(Integer integer);
}
