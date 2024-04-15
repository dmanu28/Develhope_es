package lista2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
		//In questa classe avere i metodi pubblici per ottenere le informazioni.
		//Creare un ArrayList con 12 elementi e stamparlo in console.
		//Mettere in ordine la collezione e stampare il risultato
		
		Studente studente1 = new Studente("Anna", 19);
		Studente studente2 = new Studente("Giusy", 18);
		Studente studente3 = new Studente("Milo", 21);
		Studente studente4 = new Studente("Arianna", 19);
		Studente studente5 = new Studente("Andrea", 17);
		Studente studente6 = new Studente("Zoe", 29);
		Studente studente7 = new Studente("Gino", 18);
		Studente studente8 = new Studente("Luigi", 23);
		Studente studente9 = new Studente("Cate", 22);
		Studente studente10 = new Studente("Ilario", 19);
		Studente studente11 = new Studente("Susanna", 18);
		Studente studente12 = new Studente("Clementino", 25);
		
		ArrayList<Studente> lista = new ArrayList<Studente>();
		lista.add(studente1);
		lista.add(studente2);
		lista.add(studente3);
		lista.add(studente4);
		lista.add(studente5);
		lista.add(studente6);
		lista.add(studente7);
		lista.add(studente8);
		lista.add(studente9);
		lista.add(studente10);
		lista.add(studente11);
		lista.add(studente12);
		
		System.out.println(lista);
		lista.sort(Comparator.comparing(Studente::getNome));
		System.out.println(lista);
		
	}

}
