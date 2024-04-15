package lista2;

public class Studente {

		private String nome;
		private Integer eta;
		
		public Studente(String nome, Integer eta) {
			this.nome = nome;
			this.eta = eta;
		}

		public String getNome() {
			return nome;
		}

		@Override
		public String toString() {
			return "Studente [nome=" + nome + ", eta=" + eta + "]";
		}
		
		
}
