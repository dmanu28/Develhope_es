package buildbuilder;

public class Main {
	/*Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome,
 gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video*/

	public static void main(String[] args) {
		
		Person person = new Person.Build("Sir", "Dayton").setAge(27).build();
				

		System.out.println(person);
		
		Person person2 = new Person.Build("Zach", "Jamienson").setAddress("Via Fiumicino").build();
		
		System.out.println(person2);
		
	}

}