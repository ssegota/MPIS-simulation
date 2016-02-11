package Komponente;

public class DistantnaZastita  extends Zastita{
	private Boolean poticaj;
	
	public void printPoticaj(){	System.out.println(poticaj); }
	
	@Override
	public void printAll(){
		printIdentifikator();
		printName();
		printNaponskaRazina();
		printStanje();
		printKvar();
		printIskljucenje();
		printPrekidac();
		printPoticaj();
	}
	public Boolean getPoticaj() {
		return poticaj;
	}

	public void setPoticaj(Boolean poticaj) {
		this.poticaj = poticaj;
	}

	public DistantnaZastita(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Boolean poticaj, Prekidac prekidac) {
		super();
		setIdentifikator(identifikator);
		setName(name);
		setNaponskaRazina(naponskaRazina);
		setStanje(stanje);
		setKvar(kvar);
		setIskljucenje(iskljucenje);
		setPrekidac(prekidac);
		this.poticaj = poticaj;
	}

	@Override
	public String toString() {
		return "DistantnaZastita [poticaj=" + poticaj + ", getIdentifikator()=" + getIdentifikator() + ", getName()="
				+ getName() + ", getNaponskaRazina()=" + getNaponskaRazina() + ", getStanje()=" + getStanje()
				+ ", getKvar()=" + getKvar() + ", getIskljucenje()=" + getIskljucenje() + "]";
	}
	
	
	
}
