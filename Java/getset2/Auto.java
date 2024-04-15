package getset2;

public class Auto {
	public int cilindrata;
	public String modello;
	public String targa;
	public String marca;
	
	public Auto(int cilindrata, String modello, String targa, String marca) {
		this.cilindrata = cilindrata;
		this.modello = modello;
		this.targa = targa;
		this.marca = marca;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Auto [cilindrata=" + cilindrata + ", modello=" + modello + ", targa=" + targa + ", marca=" + marca
				+ ", getCilindrata()=" + getCilindrata() + ", getModello()=" + getModello() + ", getTarga()="
				+ getTarga() + ", getMarca()=" + getMarca() + "]";
	}
	
	

}
