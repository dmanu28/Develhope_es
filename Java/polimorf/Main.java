package polimorf;

import main.Forma;
import main.Rettangolo;

public class Main {

	public static void main(String[] args) {
		Forma forma = new Forma();
		Rettangolo rettangolo = new Rettangolo(2,6);
		Triangolo triangolo = new Triangolo(4,2);
		
		forma.calcolaArea();
		rettangolo.calcolaArea();
		triangolo.calcolaArea();
	}

}
