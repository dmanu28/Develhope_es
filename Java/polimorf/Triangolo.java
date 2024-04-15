package polimorf;

public class Triangolo {
	private double base;
	private double altezza;
	private double area;
	
	public Triangolo(double base, double altezza) {
		this.altezza = altezza;
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void calcolaArea() {
		System.out.println(this.base * this.altezza);
	}
	
	

	

}
