package eshashmap;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Articolo articolo1 = new Articolo("pizza", 3.50);
		Articolo articolo2 = new Articolo("gelato", 1.50);
		Articolo articolo3 = new Articolo("Fanta", 1.00);
		
		HashMap<String, Articolo> articoliAggr = new HashMap<String, Articolo>();
		articoliAggr.put("Cibo", articolo1);
		articoliAggr.put("Dolce", articolo2);
		articoliAggr.put("Bevanda", articolo3);
		
		System.out.println(articoliAggr);
		
		Map<String, Articolo> artAggregato = Map.of("Cibo", articolo1, "Dolce", articolo2, "Bevanda", articolo3);
		System.out.println(articoliAggr);
		
		Map<String, Articolo> mappa = new HashMap<String, Articolo>(
		Map.ofEntries(
				new AbstractMap.SimpleEntry<String, Articolo>("Cibo", articolo1),
				new AbstractMap.SimpleEntry<String, Articolo>("Dolce", articolo2),
				new AbstractMap.SimpleEntry<String, Articolo>("Bevanda", articolo3)
				));
		System.out.println(articoliAggr);
		
		for(Map.Entry<String, Articolo> element : mappa.entrySet()) {
			System.out.println(element);
		}
		
		Set<String> keys = articoliAggr.keySet();
		System.out.println(keys);
		
		Collection<Articolo> values = artAggregato.values();
		System.out.println(values);
	}
}
