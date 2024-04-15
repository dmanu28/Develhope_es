package astratto;

public class Rettangolo extends Forma {
	
	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		
		this.altezza = altezza;
		this.base = base;
	}

	@Override
	public void calcolaArea() {
		System.out.println(base * altezza);
	}
	
	

}
