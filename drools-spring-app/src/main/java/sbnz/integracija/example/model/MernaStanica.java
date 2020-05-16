package sbnz.integracija.example.model;

import java.io.Serializable;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
public class MernaStanica implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer redniBroj;
	
	private String naziv;
	private String lokacija;
	private double nivoVode;
	private double maxNivo;
	private double padavine;
	private boolean aktivna;
	
	
	
	public MernaStanica() {
		super();
	}

	public MernaStanica(int redniBroj, String naziv, String lokacija, double nivoVode, double maxNivo, double padavine,
			boolean aktivna) {
		super();
		this.redniBroj = redniBroj;
		this.naziv = naziv;
		this.lokacija = lokacija;
		this.nivoVode = nivoVode;
		this.maxNivo = maxNivo;
		this.padavine = padavine;
		this.aktivna = aktivna;
	}


	public int getRedniBroj() {
		return redniBroj;
	}



	public void setRedniBroj(int redniBroj) {
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



	public double getMaxNivo() {
		return maxNivo;
	}

	public void setMaxNivo(double maxNivo) {
		this.maxNivo = maxNivo;
	}
	
	
	
	
	
	
}
