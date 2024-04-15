package interFace;

public class Main {

	public static void main(String[] args) {
		//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
		//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
		Rettangolo rettangolo = new Rettangolo(4, 3);
		Triangolo triangolo = new Triangolo(2, 3);
		
		rettangolo.calcolaArea();
		triangolo.calcolaArea();
		System.out.println(triangolo.getArea());
		System.out.println(rettangolo.getArea());
	}

}
