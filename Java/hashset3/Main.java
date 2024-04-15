package hashset3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import hashset3.Coso;

public class Main {

	public static void main(String[] args) {
		// Scrivere una funzione che restituisca un hashset riempito
		//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
		//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
		//Svuotare l'hashset, verificarlo e stampare il risultatostub
		
		Coso coso1 = new Coso("Blue");
		Coso coso2 = new Coso("Red");
		Coso coso3 = new Coso("Silver");
		Coso coso4 = new Coso("Green");
		
		Set<Coso> lista = new HashSet<Coso>();
		lista.add(coso1);
		lista.add(coso2);
		lista.add(coso3);
		lista.add(coso4);
		
		System.out.println(lista);
		
		Iterator<Coso> iterator = lista.iterator();
		while(iterator.hasNext()) {
			Coso element = iterator.next();
			System.out.println(element);
			if(element.equals(coso2)) {
				iterator.remove();
			}
		}
		
		System.out.println(lista);
		
		
	}

}
