package singleton;

public class EsDevhope {

	private String name;
	private Integer age;
	
	public EsDevhope(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(getName()+" "+ getAge());
	}

	@Override
	public String toString() {
		return "EsDevhope [name=" + name + ", age=" + age + "]";
	}
	
	public static class User{
		private static User user = null;
		private static String name;
		private static Integer age;
		
		private User() {
			User.name = "Nico Robin";
			User.age = 32;
		}
		
		public static User getUser() {
			if(user == null) {
				user = new User();
			}
			return user;
		}
		
		private static String getName() {
			return name;
		}
		
		private static Integer getAge() {
			return age;
		}
		
		public static void showInfo() {
			System.out.println(getName()+" "+getAge());
		}
	}
	
}
