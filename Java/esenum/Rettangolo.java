package esenum;

public class Rettangolo extends Forma {
	
	private double altezza;
	private double base;
	private FormaEnum rettangolo = FormaEnum.RETTANGOLO;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public void calcolaArea() {
		System.out.println(base * altezza);
	}
}
