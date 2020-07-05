package sbnz.integracija.example.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GSUpdateDTO  implements Serializable{
	
	private double nivoVode;
	private boolean otvorena;
	private String stanje;
	
	
	
	public GSUpdateDTO() {
		super();
	}
	public GSUpdateDTO(double nivoVode, boolean otvorena, String stanje) {
		super();
		this.nivoVode = nivoVode;
		this.otvorena = otvorena;
		this.stanje = stanje;
	}
	public double getNivoVode() {
		return nivoVode;
	}
	public void setNivoVode(double nivoVode) {
		this.nivoVode = nivoVode;
	}
	public boolean isOtvorena() {
		return otvorena;
	}
	public void setOtvorena(boolean otvorena) {
		this.otvorena = otvorena;
	}
	public String getStanje() {
		return stanje;
	}
	public void setStanje(String stanje) {
		this.stanje = stanje;
	}

	
	
	
}
