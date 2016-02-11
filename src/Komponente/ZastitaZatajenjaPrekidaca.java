package Komponente;

public class ZastitaZatajenjaPrekidaca extends Zastita{
	private Boolean iskljucenje2;
	
	public void printIskljucenje2(){	System.out.println(iskljucenje2); }
	
	@Override
	public void printAll(){
		printIdentifikator();
		printName();
		printNaponskaRazina();
		printStanje();
		printKvar();
		printIskljucenje();
		printPrekidac();
		printIskljucenje2();
	}

	public Boolean getIskljucenje2() {
		return iskljucenje2;
	}

	public void setIskljucenje2(Boolean iskljucenje2) {
		this.iskljucenje2 = iskljucenje2;
	}

	public ZastitaZatajenjaPrekidaca(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Boolean iskljucenje2, Prekidac prekidac) {
		super();
		setIdentifikator(identifikator);
		setName(name);
		setNaponskaRazina(naponskaRazina);
		setStanje(stanje);
		setKvar(kvar);
		setIskljucenje(iskljucenje);
		setPrekidac(prekidac);
		this.iskljucenje2 = iskljucenje2;
	}

	@Override
	public String toString() {
		return "ZastitaZatajenjaPrekidaca [iskljucenje2=" + iskljucenje2 + ", getIdentifikator()=" + getIdentifikator()
				+ ", getName()=" + getName() + ", getNaponskaRazina()=" + getNaponskaRazina() + ", getStanje()="
				+ getStanje() + ", getKvar()=" + getKvar() + ", getIskljucenje()=" + getIskljucenje() + "]";
	}
	
	
}
