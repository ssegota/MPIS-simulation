package Komponente;

public class ZastitaZatajenjaPrekidaca extends Zastita{
	private Boolean iskljucenje2;

	public Boolean getIskljucenje2() {
		return iskljucenje2;
	}

	public void setIskljucenje2(Boolean iskljucenje2) {
		this.iskljucenje2 = iskljucenje2;
	}

	public ZastitaZatajenjaPrekidaca(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Boolean iskljucenje2) {
		super();
		setIdentifikator(identifikator);
		setName(name);
		setNaponskaRazina(naponskaRazina);
		setStanje(stanje);
		setKvar(kvar);
		setIskljucenje(iskljucenje);
		this.iskljucenje2 = iskljucenje2;
	}
	
	
}
