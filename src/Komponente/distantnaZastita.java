package Komponente;

public class DistantnaZastita  extends Zastita{
	private Boolean poticaj;

	public Boolean getPoticaj() {
		return poticaj;
	}

	public void setPoticaj(Boolean poticaj) {
		this.poticaj = poticaj;
	}

	public DistantnaZastita(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Boolean poticaj) {
		super();
		setIdentifikator(identifikator);
		setName(name);
		setNaponskaRazina(naponskaRazina);
		setStanje(stanje);
		setKvar(kvar);
		setIskljucenje(iskljucenje);
		this.poticaj = poticaj;
	}
	
	
	
}
