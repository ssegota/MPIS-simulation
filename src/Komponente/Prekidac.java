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
	private Apu z_apu;
	private ZastitaZatajenjaPrekidaca z_prekidac;
	private DistantnaZastita z_distantna;
	
	
	public void printIdentifikator(){	System.out.println(identifikator); }
	public void printName(){	System.out.println(name); }
	public void printNaponskaRazina(){	System.out.println(naponskaRazina); }
	public void printStanje(){	System.out.println(stanje); }
	public void printBlokadaRada(){	System.out.println(blokadaRada); }
	public void printBlokadaIsklopa(){	System.out.println(blokadaIsklopa); }
	public void printGubitakSF6(){	System.out.println(gubitakSF6); }
	public void printTlakUlja(){	System.out.println(tlakUlja); }
	public void printGubitakUlja(){	System.out.println(gubitakUlja); }
	public void printGubitakN2(){	System.out.println(gubitakN2); }
	
	public void printAll(){
		printIdentifikator();
		printName();
		printNaponskaRazina();
		printStanje();
		printBlokadaRada();
		printBlokadaIsklopa();
		printGubitakSF6();
		printTlakUlja();
		printGubitakUlja();
		printGubitakN2();
	}
	
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
		if(z_apu.getStanje() || z_distantna.getStanje() || z_prekidac.getStanje())
			stanje="iskljucen";
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
		if(blokadaRada)
			setStanje("iskljucen");
	}
	public Boolean getBlokadaIsklopa() {
		return blokadaIsklopa;
	}
	public void setBlokadaIsklopa(Boolean blokadaIsklopa) {
		this.blokadaIsklopa = blokadaIsklopa;
		if(blokadaIsklopa)
			setStanje("kvar");
	}
	public Boolean getGubitakSF6() {
		return gubitakSF6;
	}
	public void setGubitakSF6(Boolean gubitakSF6) {
		this.gubitakSF6 = gubitakSF6;
		if(gubitakSF6)
			setStanje("kvar");
	}
	public Integer getTlakUlja() {
		return tlakUlja;
	}
	public void setTlakUlja(Integer tlakUlja) {
		this.tlakUlja = tlakUlja;
		if(tlakUlja<=0)
			setStanje("kvar");
	}
	public Boolean getGubitakUlja() {
		return gubitakUlja;
	}
	public void setGubitakUlja(Boolean gubitakUlja) {
		this.gubitakUlja = gubitakUlja;
		if(gubitakUlja)
			setStanje("kvar");
	}
	public Boolean getGubitakN2() {
		return gubitakN2;
	}
	public void setGubitakN2(Boolean gubitakN2) {
		this.gubitakN2 = gubitakN2;
		if(gubitakN2)
			setStanje("kvar");
	}
	
	
	public Apu getZ_apu() {
		return z_apu;
	}
	public void setZ_apu(Apu z_apu) {
		this.z_apu = z_apu;
	}
	public ZastitaZatajenjaPrekidaca getZ_prekidac() {
		return z_prekidac;
	}
	public void setZ_prekidac(ZastitaZatajenjaPrekidaca z_prekidac) {
		this.z_prekidac = z_prekidac;
	}
	public DistantnaZastita getZ_distantna() {
		return z_distantna;
	}
	public void setZ_distantna(DistantnaZastita z_distantna) {
		this.z_distantna = z_distantna;
	}
	public Rastavljac getR_linijski() {
		return r_linijski;
	}
	public Rastavljac getR_dv() {
		return r_dv;
	}
	public Rastavljac getR_uzemljenje() {
		return r_uzemljenje;
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
	@Override
	public String toString() {
		return "Prekidac [identifikator=" + identifikator + ", name=" + name + ", naponskaRazina=" + naponskaRazina
				+ ", stanje=" + stanje + ", blokadaRada=" + blokadaRada + ", blokadaIsklopa=" + blokadaIsklopa
				+ ", gubitakSF6=" + gubitakSF6 + ", tlakUlja=" + tlakUlja + ", gubitakUlja=" + gubitakUlja
				+ ", gubitakN2=" + gubitakN2  + ", z_apu=" + z_apu + ", z_prekidac="
				+ z_prekidac + ", z_distantna=" + z_distantna + "]";
	}

	
	
}
