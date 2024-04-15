package hashset2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Coso {
	public  Set<String> riempiSet(){
		Set<String> lista = new HashSet<String>();
		lista.add("blue");
		lista.add("nero");
		lista.add("oro");
		lista.addAll(addObj);
		return lista;
	}
	
	public Set<String> addObj = new HashSet<String>(Arrays.asList("cozza","spieggia","mare"));
}
