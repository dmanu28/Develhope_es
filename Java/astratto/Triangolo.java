package astratto;

public class Triangolo extends Forma {
	
	private double base;
	private double altezza;

	public Triangolo(double base, double altezza) {
		
		this.altezza = altezza;
		this.base = base;
	}

	@Override
	public void calcolaArea() {
		System.out.println(base * altezza / 2);
		
	}
	
	

}
