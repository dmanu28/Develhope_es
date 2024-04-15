package buildbuilder;

public class Person {

	String firstName;
	String lastName;
	Integer age;
	String address;

	
	public Person(Build builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.address = builder.address;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}




	public static class Build {
		
		String firstName;
		String lastName;
		Integer age;
		String address;
		
		public Build(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Build setAge(Integer age) {
			this.age = age;
			return this;
		}
		public Build setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}

	}
}
