package Komponente;

public class Rastavljac {
	private Integer identifikator;
	private String name;
	private Boolean stanje;
	private Boolean komanda;
	private Integer naponskaRazina;
	private String tip; //TIP -> linijski, uzemljenje, dv
	
	public void ispisStanja(){}
	public void ukljuci(){}
	public void iskljuci(){}
	public void uklopi(){}
	public void isklopi(){}
	public void kvarSignalizacije(){}
	public void medjupolozaj(){}
	
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
	public Boolean getStanje() {
		return stanje;
	}
	public void setStanje(Boolean stanje) {
		this.stanje = stanje;
	}
	public Boolean getKomanda() {
		return komanda;
	}
	public void setKomanda(Boolean komanda) {
		this.komanda = komanda;
	}

	public Integer getNaponskaRazina() {
		return naponskaRazina;
	}
	public void setNaponskaRazina(Integer naponskaRazina) {
		this.naponskaRazina = naponskaRazina;
	}
	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Rastavljac(Integer identifikator, String name, Boolean stanje, Boolean komanda, Integer naponskaRazina, String tip) {
		super();
		this.identifikator = identifikator;
		this.name = name;
		this.stanje = stanje;
		this.komanda = komanda;
		this.naponskaRazina = naponskaRazina;
		this.tip = tip;
	}
	
	
}
