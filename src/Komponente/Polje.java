package Komponente;

public class Polje {
	private Boolean podNaponom;
	private Integer naponskaRazina;
	private Boolean ukljucenaZastita;
	private String tipUkljuceneZastite;
	private Integer identifikator;
	private String name;

	Rastavljac r_uzemljenje; 
	Rastavljac r_dv;
	Rastavljac r_linijski; 
	ZastitaZatajenjaPrekidaca z_prekidac; 
	Apu z_apu;
	DistantnaZastita z_distantna;
	Prekidac prekidac;
	
	public void ispisStanja(){}
	
	public void ukljucenjeNapona(){}
	
	public void ukljucenjeZastite(){}
	
	public Boolean getPodNaponom() {
		return podNaponom;
	}

	public void setPodNaponom(Boolean podNaponom) {
		this.podNaponom = podNaponom;
	}

	public Integer getNaponskaRazina() {
		return naponskaRazina;
	}

	public void setNaponskaRazina(Integer naponskaRazina) {
		this.naponskaRazina = naponskaRazina;
	}

	public Boolean getUkljucenaZastita() {
		return ukljucenaZastita;
	}

	public void setUkljucenaZastita(Boolean ukljucenaZastita) {
		this.ukljucenaZastita = ukljucenaZastita;
	}

	public String getTipUkljuceneZastite() {
		return tipUkljuceneZastite;
	}

	public void setTipUkljuceneZastite(String tipUkljuceneZastite) {
		this.tipUkljuceneZastite = tipUkljuceneZastite;
	}

	public Integer getIdentifikator() {
		return identifikator;
	}

	public void setIdentifikator(Integer identifikator) {
		this.identifikator = identifikator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Polje(Boolean podNaponom, Integer naponskaRazina, Boolean ukljucenaZastita, String tipUkljuceneZastite,
			Integer identifikator, String name, Rastavljac r_uzemljenje, Rastavljac r_dv, Rastavljac r_linijski,
			ZastitaZatajenjaPrekidaca z_prekidac, Apu z_apu, DistantnaZastita z_distantna, Prekidac prekidac) {
		super();
		this.podNaponom = podNaponom;
		this.naponskaRazina = naponskaRazina;
		this.ukljucenaZastita = ukljucenaZastita;
		this.tipUkljuceneZastite = tipUkljuceneZastite;
		this.identifikator = identifikator;
		this.name = name;
		this.r_uzemljenje = r_uzemljenje;
		this.r_dv = r_dv;
		this.r_linijski = r_linijski;
		this.z_prekidac = z_prekidac;
		this.z_apu = z_apu;
		this.z_distantna = z_distantna;
		this.prekidac = prekidac;
	}



	
	
	
}
