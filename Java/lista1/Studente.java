package lista1;

public class Studente {
	private String name;
	private Integer age;
	
	public Studente(String name, Integer age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public Integer getAge() {
		return age;
	}



	@Override
	public String toString() {
		return "Studente [name=" + name + ", age=" + age + "]";
	}
	
	
}
