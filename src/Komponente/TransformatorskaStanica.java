package Komponente;

public class TransformatorskaStanica {


	
	private Boolean stanje;
	private Boolean zastite;
	private Boolean smetnje;
	private Integer identifikator;
	private String name;

	public void ispisStanja(){
		
	}
	public void unutarnjaSmetnja(){
		
	}
	public void zastite(){
		
	}
	public Boolean getStanje() {
		return stanje;
	}
	public void setStanje(Boolean stanje) {
		this.stanje = stanje;
	}
	public Boolean getZastite() {
		return zastite;
	}
	public void setZastite(Boolean zastite) {
		this.zastite = zastite;
	}
	public Boolean getSmetnje() {
		return smetnje;
	}
	public void setSmetnje(Boolean smetnje) {
		this.smetnje = smetnje;
	}
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
	public TransformatorskaStanica(Boolean stanje, Boolean zastite, Boolean smetnje, Integer identifikator,
			String name) {
		super();
		this.stanje = stanje;
		this.zastite = zastite;
		this.smetnje = smetnje;
		this.identifikator = identifikator;
		this.name = name;
	}
	
	
	
}
