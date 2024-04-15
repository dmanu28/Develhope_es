package getset3;

import getset2.Auto;

public class Main {

	public static void main(String[] args) {
		// Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
		//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
		//Nel main dichiarare un oggetto di tipo Auto.
		Auto auto = new Auto(1000, "R50", "XXXXX", "MiniCooper");
		
		System.out.println(auto);

	}

}
