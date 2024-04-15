package hashset1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static Set<String> scriviSet() {
		Set<String> pippo = new HashSet<String>(Arrays.asList("ciao","sole","cielo"));
		return pippo;
		
	}

	public static void main(String[] args) {
		// Scrivere una funzione che restituisca un hashset riempito
		//Leggere l'hashSet e stampre grandezza ed elementi
		//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
		//Verificare che l' elemento sia parte del Set e stampare il risultato
		
		System.out.println(scriviSet());
		System.out.println(scriviSet().size());
		
		
	}

}
