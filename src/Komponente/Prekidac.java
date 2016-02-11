package Komponente;

public class Prekidac {
	private Integer identifikator;
	private String name;
	private Integer naponskaRazina;
	private String stanje;
	private Boolean blokadaRada;
	private Boolean blokadaIsklopa;
	private Boolean gubitakSF6;
	private Integer tlakUlja;
	private Boolean gubitakUlja;
	private Boolean gubitakN2;
	private Rastavljac r_linijski;
	private Rastavljac r_dv;
	private Rastavljac r_uzemljenje;
	
	public void ispisStanja(){}
	public void uklop(){}
	public void isklop(){}
	public void prorada(){}
	public void prestanak(){}
	
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
	public String getStanje() {
		return stanje;
	}
	public void setStanje(String stanje) {
		this.stanje = stanje;
		if(stanje=="ukljucen"){
			r_uzemljenje.setStanje(false);
			r_dv.setStanje(true);
			r_linijski.setStanje(true);
		}
	}
	public Boolean getBlokadaRada() {
		return blokadaRada;
	}
	public void setBlokadaRada(Boolean blokadaRada) {
		this.blokadaRada = blokadaRada;
	}
	public Boolean getBlokadaIsklopa() {
		return blokadaIsklopa;
	}
	public void setBlokadaIsklopa(Boolean blokadaIsklopa) {
		this.blokadaIsklopa = blokadaIsklopa;
	}
	public Boolean getGubitakSF6() {
		return gubitakSF6;
	}
	public void setGubitakSF6(Boolean gubitakSF6) {
		this.gubitakSF6 = gubitakSF6;
	}
	public Integer getTlakUlja() {
		return tlakUlja;
	}
	public void setTlakUlja(Integer tlakUlja) {
		this.tlakUlja = tlakUlja;
	}
	public Boolean getGubitakUlja() {
		return gubitakUlja;
	}
	public void setGubitakUlja(Boolean gubitakUlja) {
		this.gubitakUlja = gubitakUlja;
	}
	public Boolean getGubitakN2() {
		return gubitakN2;
	}
	public void setGubitakN2(Boolean gubitakN2) {
		this.gubitakN2 = gubitakN2;
	}
	public Prekidac(Integer identifikator, String name, Integer naponskaRazina, String stanje, Boolean blokadaRada,
			Boolean blokadaIsklopa, Boolean gubitakSF6, Integer tlakUlja, Boolean gubitakUlja, Boolean gubitakN2,
			Rastavljac r_linijski, Rastavljac r_dv, Rastavljac r_uzemljenje) {
		super();
		this.identifikator = identifikator;
		this.name = name;
		this.naponskaRazina = naponskaRazina;
		this.stanje = stanje;
		this.blokadaRada = blokadaRada;
		this.blokadaIsklopa = blokadaIsklopa;
		this.gubitakSF6 = gubitakSF6;
		this.tlakUlja = tlakUlja;
		this.gubitakUlja = gubitakUlja;
		this.gubitakN2 = gubitakN2;
		this.r_linijski = r_linijski;
		this.r_dv = r_dv;
		this.r_uzemljenje = r_uzemljenje;
	}

	
}
