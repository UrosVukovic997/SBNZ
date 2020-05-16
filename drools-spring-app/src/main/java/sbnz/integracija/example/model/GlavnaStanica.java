package sbnz.integracija.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="GlavnaStanica")
@SuppressWarnings("serial")
public class GlavnaStanica implements Serializable{


	private static GlavnaStanica instance;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String naziv;
	private String lokacija;
	private double nivoVode;
	
	@OneToMany(mappedBy = "gStanica", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<MernaStanica> stanice;
	
	
	
	public GlavnaStanica() {
		super();
		this.stanice = new HashSet<MernaStanica>();
	}



	public GlavnaStanica(int id, String naziv, String lokacija, double nivoVode,Set< MernaStanica> stanice) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.lokacija = lokacija;
		this.nivoVode = nivoVode;
		this.stanice = stanice;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNaziv() {
		return naziv;
	}



	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}



	public String getLokacija() {
		return lokacija;
	}



	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}



	public double getNivoVode() {
		return nivoVode;
	}



	public void setNivoVode(double nivoVode) {
		this.nivoVode = nivoVode;
	}



	public Set<MernaStanica> getStanice() {
		return stanice;
	}


	public GlavnaStanica getInstance() {
		if(GlavnaStanica.instance != null)
			return GlavnaStanica.instance;
		else {
			GlavnaStanica.instance = new GlavnaStanica();
			return GlavnaStanica.instance;
		}
	}
}
