package erede1;

public class Animale {
	
	private String verso;

	public Animale(String verso) {
		this.verso = verso;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}
	
	public void faIlVerso() {
		this.setVerso("GRRRR");
		System.out.println(this.getVerso());
	}
	
}
