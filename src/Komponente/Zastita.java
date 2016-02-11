package Komponente;

public class Zastita {

	private Integer identifikator;
	private String name;
	private Integer naponskaRazina;
	private Boolean stanje;
	private Boolean kvar;
	private Boolean iskljucenje;
	private Prekidac prekidac;
	
	public void uklop(){}
	public void isklop(){}
	public void prorada(){}
	public void prestanak(){}
	public void iskljuciUkljuci(){}
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
	public Integer getNaponskaRazina() {
		return naponskaRazina;
	}
	public void setNaponskaRazina(Integer naponskaRazina) {
		this.naponskaRazina = naponskaRazina;
	}
	public Boolean getStanje() {
		return stanje;
	}
	public void setStanje(Boolean stanje) {
		this.stanje = stanje;
		if(stanje)
			prekidac.setStanje("iskljucen");
		else
			prekidac.setStanje("ukljucen");
	}
	public Boolean getKvar() {
		return kvar;
	}
	public void setKvar(Boolean kvar) {
		this.kvar = kvar;
	}
	public Boolean getIskljucenje() {
		return iskljucenje;
	}
	public void setIskljucenje(Boolean iskljucenje) {
		this.iskljucenje = iskljucenje;
		if(stanje)
			prekidac.setStanje("iskljucen");
		else
			prekidac.setStanje("ukljucen");
	}
	public Zastita() {
		super();
	}
	
	public Zastita(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Prekidac prekidac) {
		super();
		this.identifikator = identifikator;
		this.name = name;
		this.naponskaRazina = naponskaRazina;
		this.stanje = stanje;
		this.kvar = kvar;
		this.iskljucenje = iskljucenje;
		this.prekidac = prekidac;
	}

	
	
	
}
