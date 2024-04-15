package interFace;

public class Triangolo implements Forma {
	
	private double base;
	private double altezza;
	private double area;
	public Triangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
		
	}
	
	public double getArea() {
		return area;
	}
	
	public void calcolaArea() {
		this.area = this.base * this.altezza / 2;
	}

}
