package sbnz.integracija.example.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GSUpdateDTO  implements Serializable{
	
	private double nivoVode;
	private boolean otvorena;
	
	public GSUpdateDTO() {
		super();
	}

	public GSUpdateDTO(double nivoVode, boolean otvorena) {
		super();
		this.nivoVode = nivoVode;
		this.otvorena = otvorena;
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
	
	
}
