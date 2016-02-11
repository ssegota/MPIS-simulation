package Komponente;

public class Apu  extends Zastita{
	public Boolean zastita1p;
	public Boolean zastita3p;
	
	public void printZastita1p(){	System.out.println(zastita1p); }
	public void printZastita3p(){	System.out.println(zastita3p); }
	@Override
	public void printAll(){
		printIdentifikator();
		printName();
		printNaponskaRazina();
		printStanje();
		printKvar();
		printIskljucenje();
		printPrekidac();
		printZastita1p();
		printZastita3p();
	}
	
	public Boolean getZastita1p() {
		return zastita1p;
	}
	public void setZastita1p(Boolean zastita1p) {
		this.zastita1p = zastita1p;
		if(zastita1p)
			setStanje(false);
	}
	public Boolean getZastita3p() {
		return zastita3p;
	}
	public void setZastita3p(Boolean zastita3p) {
		this.zastita3p = zastita3p;
		if(zastita3p)
			setStanje(false);
	}
	public Apu(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Boolean zastita1p, Boolean zastita3p, Prekidac prekidac) {
		super();
		setIdentifikator(identifikator);
		setName(name);
		setNaponskaRazina(naponskaRazina);
		setStanje(stanje);
		setKvar(kvar);
		setIskljucenje(iskljucenje);
		setPrekidac(prekidac);
		this.zastita1p = zastita1p;
		this.zastita3p = zastita3p;
	}
	@Override
	public String toString() {
		return "Apu [zastita1p=" + zastita1p + ", zastita3p=" + zastita3p + ", getIdentifikator()=" + getIdentifikator()
				+ ", getName()=" + getName() + ", getNaponskaRazina()=" + getNaponskaRazina() + ", getStanje()="
				+ getStanje() + ", getKvar()=" + getKvar() + ", getIskljucenje()=" + getIskljucenje() + "]";
	}
	
	
	
	
}
