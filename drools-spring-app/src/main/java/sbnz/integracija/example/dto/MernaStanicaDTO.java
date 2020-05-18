package sbnz.integracija.example.dto;

import javax.persistence.Column;

import sbnz.integracija.example.model.MernaStanica;

public class MernaStanicaDTO {

	private Integer redniBroj;
	private String naziv;
	private String lokacija;
	private double nivoVode;
	private double maxNivo;
	private double padavine;
	private boolean aktivna;
	private boolean alarm;
	
	public MernaStanicaDTO() {
		super();
	}

	public MernaStanicaDTO(Integer redniBroj, String naziv, String lokacija, double nivoVode, double maxNivo,
			double padavine, boolean aktivna, boolean alarm) {
		super();
		this.redniBroj = redniBroj;
		this.naziv = naziv;
		this.lokacija = lokacija;
		this.nivoVode = nivoVode;
		this.maxNivo = maxNivo;
		this.padavine = padavine;
		this.aktivna = aktivna;
		this.alarm = alarm;
	}
	
	public MernaStanicaDTO(MernaStanica ms) {
		super();
		this.redniBroj = ms.getRedniBroj();
		this.naziv = ms.getNaziv();
		this.lokacija = ms.getLokacija();
		this.nivoVode = ms.getNivoVode();
		this.maxNivo = ms.getMaxNivo();
		this.padavine = ms.getPadavine();
		this.aktivna = ms.isAktivna();
		this.alarm = ms.isAlarm();
	}

	public Integer getRedniBroj() {
		return redniBroj;
	}

	public void setRedniBroj(Integer redniBroj) {
		this.redniBroj = redniBroj;
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

	public double getMaxNivo() {
		return maxNivo;
	}

	public void setMaxNivo(double maxNivo) {
		this.maxNivo = maxNivo;
	}

	public double getPadavine() {
		return padavine;
	}

	public void setPadavine(double padavine) {
		this.padavine = padavine;
	}

	public boolean isAktivna() {
		return aktivna;
	}

	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	
	
	
}
