package esenum;

public class Triangolo extends Forma {

	private double altezza;
	private double base;
	private FormaEnum triangolo = FormaEnum.TRIANGOLO;
	
	public Triangolo(double base, double altezza) {
		
		this.altezza = altezza;
		this.base = base;
	}
	
	public void calcolaArea() {
		System.out.println(base * altezza/2);
			
	}

}
