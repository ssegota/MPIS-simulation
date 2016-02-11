package Komponente;

public class Rastavljac {
	private Integer identifikator;
	private String name;
	private Boolean stanje;
	private Boolean komanda;
	private Integer naponskaRazina;
	
	private Prekidac prekidac;
	
	public void printIdentifikator(){	System.out.println(identifikator); }
	public void printName(){	System.out.println(name); }
	public void printStanje(){	System.out.println(stanje); }
	public void printKomanda(){	System.out.println(komanda); }
	public void printNaponskaRazina(){	System.out.println(naponskaRazina); }
	public void printPrekidac(){	System.out.println(prekidac); }
	
	public void printAll(){
		printIdentifikator();
		printName();
		printStanje();
		printKomanda();
		printNaponskaRazina();

		
		
		printPrekidac();
	}
	
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
		if(prekidac.getStanje()=="iskljucen")
			stanje=false;
	}
	public Boolean getKomanda() {
		return komanda;
	}
	public void setKomanda(Boolean komanda) {
		this.komanda = komanda;
		if(!komanda)
			setStanje(false);
	}

	public Integer getNaponskaRazina() {
		return naponskaRazina;
	}
	public void setNaponskaRazina(Integer naponskaRazina) {
		this.naponskaRazina = naponskaRazina;
	}
	

	public Prekidac getPrekidac() {
		return prekidac;
	}
	public void setPrekidac(Prekidac prekidac) {
		this.prekidac = prekidac;
	}
	public Rastavljac(Integer identifikator, String name, Boolean stanje, Boolean komanda, Integer naponskaRazina) {
		super();
		this.identifikator = identifikator;
		this.name = name;
		this.stanje = stanje;
		this.komanda = komanda;
		this.naponskaRazina = naponskaRazina;
		
	}
	
	@Override
	public String toString() {
		return "Rastavljac [identifikator=" + identifikator + ", name=" + name + ", stanje=" + stanje + ", komanda="
				+ komanda + ", naponskaRazina=" + naponskaRazina + ", prekidac=" + prekidac + "]";
	}
	
//
}
