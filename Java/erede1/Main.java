package erede1;

public class Main {

	public static void main(String[] args) {
		// Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() 
		//che stampi il verso dell'animale.
		//Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare. 
		//Prova quindi a far stampare il verso di Animale e di Gatto.
		
		Animale animale = new Animale(null);
		Gatto gatto = new Gatto(null);
		
		animale.faIlVerso();
		gatto.faIlVerso();
		//System.out.println(animale.getVerso());
		
		

	}

}
