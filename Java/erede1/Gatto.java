package erede1;

public class Gatto extends Animale {

	private String verso = "";
	
	public Gatto(String verso) {
		super(verso);
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public void faIlVerso() {
		this.setVerso("MIAOoO");
		System.out.println(this.getVerso());
	}
	
}
