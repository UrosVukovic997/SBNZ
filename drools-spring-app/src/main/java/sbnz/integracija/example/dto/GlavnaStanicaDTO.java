package sbnz.integracija.example.dto;

import sbnz.integracija.example.model.GlavnaStanica;

public class GlavnaStanicaDTO {

	private Long id;
	private String naziv;
	private String lokacija;
	private double nivoVode;
	private double minVode;
	private double maxVode;
	private boolean otvorena;
	public GlavnaStanicaDTO() {
		super();
	}
	public GlavnaStanicaDTO(Long id, String naziv, String lokacija, double nivoVode, double minVode, double maxVode,
			boolean otvorena) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.lokacija = lokacija;
		this.nivoVode = nivoVode;
		this.minVode = minVode;
		this.maxVode = maxVode;
		this.otvorena = otvorena;
	}
	
	public GlavnaStanicaDTO(GlavnaStanica gs) {
		super();
		this.id = gs.getId();
		this.naziv = gs.getNaziv();
		this.lokacija = gs.getLokacija();
		this.nivoVode = gs.getNivoVode();
		this.minVode = gs.getMinVode();
		this.maxVode = gs.getMaxVode();
		this.otvorena = gs.isOtvorena();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public double getMinVode() {
		return minVode;
	}
	public void setMinVode(double minVode) {
		this.minVode = minVode;
	}
	public double getMaxVode() {
		return maxVode;
	}
	public void setMaxVode(double maxVode) {
		this.maxVode = maxVode;
	}
	public boolean isOtvorena() {
		return otvorena;
	}
	public void setOtvorena(boolean otvorena) {
		this.otvorena = otvorena;
	}
	
	
	
	
}
