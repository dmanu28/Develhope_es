package eshashmap;

public class Articolo {
	
	private String nome;
	private Double prezzo;
	
	public Articolo(String nome, Double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Articolo [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
	
}
