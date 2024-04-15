package ternary;

public class Main {
//Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario

	public static void main(String[] args) {
		// ES TERNARIO 1
		for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValue(i));
		}
	
		
		//ES TERNARIO 2
		 System.out.println(checkString("Questa è una stringa"));

	}
		 private static String checkValue(int value) {
	         String result = value % 5 == 0 ? "FizzBuzz" : "Buzz";
			return result;
	     }
		 
		  private static String checkString(String value) {
		        return value.length() >= 10 ? "Lunghezza maggiore o uguale di 10" :  "Lunghezza minore di 10";
		    }

}
