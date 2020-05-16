package sbnz.integracija.example.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name="MernaStanica")
public class MernaStanica implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer redniBroj;
	
	@Column(name = "naziv", nullable = false)
	private String naziv;
	@Column(name = "lokacija", nullable = false)
	private String lokacija;
	@Column(name = "nivoVode", nullable = false)
	private double nivoVode;
	@Column(name = "maxNivo", nullable = false)
	private double maxNivo;
	@Column(name = "padavine", nullable = false)
	private double padavine;
	@Column(name = "aktivna", nullable = false)
	private boolean aktivna;
	@Column(name = "alarm", nullable = false)
	private boolean alarm;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "GlavnaStanica_id")
	private GlavnaStanica gStanica;
	
	
	
	
	public GlavnaStanica getgStanica() {
		return gStanica;
	}

	public void setgStanica(GlavnaStanica gStanica) {
		this.gStanica = gStanica;
	}

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

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	
	public boolean chekCharPre() {
		if(this.lokacija.substring(0,1).equals("-"))
			return true;
		else return false;
	}
	
	public boolean chekCharPosle() {
		if(this.lokacija.substring(0,1).equals("+"))
			return true;
		else return false;
	}
	
	
	
	
}
