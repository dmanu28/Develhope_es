package esenum;

public class Main {

	public static void main(String[] args) {
		//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() 
		//che stampi l'area della forma specifica.
		//Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne 
		//identifichi la Forma in maniera univoca usando una enum.
		
		
		Triangolo triangolo = new Triangolo(7, 5);
		triangolo.calcolaArea();
		
		Rettangolo rettangolo = new Rettangolo(3, 7);
		rettangolo.calcolaArea();

	}

}
