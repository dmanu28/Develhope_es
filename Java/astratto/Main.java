package astratto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
		//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area 
		//in maniera specifica.
		
		Rettangolo rettangolo = new Rettangolo(5, 6);
		Triangolo triangolo = new Triangolo(3,4);
		
		rettangolo.calcolaArea();
		triangolo.calcolaArea();
	}
}
