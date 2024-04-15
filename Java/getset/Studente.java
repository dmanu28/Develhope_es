package getset;

public class Studente {

	public String nome ;
	public String cognome;
	public String ID;
	public Studente(String nome, String cognome, String iD) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", ID=" + ID + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + ", getID()=" + getID() + "]";
	}
	
	
}
