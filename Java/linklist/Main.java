package linklist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// Creare una classe Fruit che accenti nel costruttore il parametro name (String)
		//In questa classe avere i metodi pubblici per ottenere le informazioni.
		//Creare un LinkedList con elementi e stamparlo in console.
		//Aggiungere un elemento al primo posto della lista e uno all'ultimo
		//Stampare la collezione aggiornata
		
		Fruit fruit1 = new Fruit("Banana");
		Fruit fruit2 = new Fruit("Cherry");
		Fruit fruit3 = new Fruit("Mango");
		Fruit fruit4 = new Fruit("Peach");
		Fruit fruit5 = new Fruit("Lime");
		
		LinkedList<Fruit> list = new LinkedList<Fruit>();
		list.add(fruit1);
		list.add(fruit3);
		list.add(fruit2);
		System.out.println(list);
		list.addFirst(fruit4);
		list.addLast(fruit5);
		System.out.println(list);
		
		
	}

}
