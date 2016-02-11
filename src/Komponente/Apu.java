package Komponente;

public class Apu  extends Zastita{
	public Boolean zastita1p;
	public Boolean zastita3p;
	
	public Boolean getZastita1p() {
		return zastita1p;
	}
	public void setZastita1p(Boolean zastita1p) {
		this.zastita1p = zastita1p;
	}
	public Boolean getZastita3p() {
		return zastita3p;
	}
	public void setZastita3p(Boolean zastita3p) {
		this.zastita3p = zastita3p;
	}
	public Apu(Integer identifikator, String name, Integer naponskaRazina, Boolean stanje, Boolean kvar,
			Boolean iskljucenje, Boolean zastita1p, Boolean zastita3p) {
		super();
		setIdentifikator(identifikator);
		setName(name);
		setNaponskaRazina(naponskaRazina);
		setStanje(stanje);
		setKvar(kvar);
		setIskljucenje(iskljucenje);
		this.zastita1p = zastita1p;
		this.zastita3p = zastita3p;
	}
	
	
	
	
}
