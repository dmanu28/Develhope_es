package lista1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
		//In questa classe avere i metodi pubblici per ottenere le informazioni.
		//Creare un ArrayList con n elementi e stamparlo in console.
		//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

			Studente studente1 = new Studente("Joel", 23);
			Studente studente2 = new Studente("Nico", 25);
			Studente studente3 = new Studente("Soledad", 27);
			Studente studente4 = new Studente("Rin", 21);
			System.out.println(studente1);
			ArrayList<Studente> alunni = new ArrayList<Studente>();
			alunni.add(studente1);
			alunni.add(studente2);
			alunni.add(studente3);
			alunni.add(studente4);
			System.out.println(alunni);
			
			alunni.sort(Comparator.comparing(Studente::getAge));
			System.out.println(alunni);
			
	}

}
