package sbnz.integracija.example.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@SuppressWarnings("serial")
public class GlavnaStanica implements Serializable{



	private static GlavnaStanica instance;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String naziv;
	private String lokacija;
	private double nivoVode;
	private double minVode;
	private double maxVode;
	private boolean otvorena;
	
	@OneToMany(mappedBy = "gStanica", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<MernaStanica> stanice;
	
	
	
	public GlavnaStanica() {
		super();
		this.stanice = new HashSet<MernaStanica>();
	}



	public GlavnaStanica(Long id, String naziv, String lokacija, double nivoVode, double minVode, double maxVode,
			boolean otvorena, Set<MernaStanica> stanice) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.lokacija = lokacija;
		this.nivoVode = nivoVode;
		this.minVode = minVode;
		this.maxVode = maxVode;
		this.otvorena = otvorena;
		this.stanice = stanice;
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



	public Set<MernaStanica> getStanice() {
		return stanice;
	}


	public static GlavnaStanica getInstance() {
			return GlavnaStanica.instance;

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



	public static void setInstance(GlavnaStanica instance) {
		GlavnaStanica.instance = instance;
	}



	public void setStanice(Set<MernaStanica> stanice) {
		this.stanice = stanice;
	}
	
	public void ispustiVodu() {
		this.nivoVode -= 0.2;
	//	WSEndPoint.fire(new GSUpdateDTO(this.nivoVode,this.otvorena));
	}
	
	public boolean proveraAlarma() {
		int i=0,j= 0;
		
		for(MernaStanica s : this.stanice) {
			System.out.println(s.getNaziv());
			if(!s.isAktivna())
				continue;
			if(s.chekCharPre()) {
				if(s.isAlarm())
					i++;
			}else {
				if(s.isAlarm())
					j++;
			}
		}
		System.out.println("i: "+i + "j: "+j);

		if((i+j)>= this.stanice.size()/2) {
			if(i>j) {
			//	this.otvorena= true;
				return true;
			}else {
			//	this.otvorena=false;
				return true;
			}
		}
		return false;

	}
	
	
}
