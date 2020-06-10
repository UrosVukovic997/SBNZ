package sbnz.integracija.example.dto;

import sbnz.integracija.example.model.VremenskaPrognoza;

public class PrognozaDTO {
	private VremenskaPrognoza mojaPrognoza;
	
	
	
	public PrognozaDTO() {
		super();
	}

	public PrognozaDTO(VremenskaPrognoza mojaPrognoza) {
		super();
		this.mojaPrognoza = mojaPrognoza;
	}

	public VremenskaPrognoza getMojaPrognoza() {
		return mojaPrognoza;
	}

	public void setMojaPrognoza(VremenskaPrognoza mojaPrognoza) {
		this.mojaPrognoza = mojaPrognoza;
	}
	
	

}
