package singleton;

public class User {

	private static User user = null;
	
	private static String nome;
	private static Integer eta;
	
	private User() {
		User.nome = "Joacquin Padmore";
		User.eta = 73;
	}
	
	
	
	public static User getUser() {
		if(user == null) {
			user = new User();
		}
		return user;
	}

	
	
	public static String getNome() {
		return nome;
	}



	public static Integer getEta() {
		return eta;
	}



	public static void stampaInfo() {
	System.out.println("Questa instanza ha i seguenti valori: nome = "+getNome()+" eta = "+getEta());
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", eta=" + eta + "]";
	}
	
}
