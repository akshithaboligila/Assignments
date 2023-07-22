
public class Person {
	int id;
	String name;
	String gender;
	String email;
	long phnum;
	public Person(int id, String name, String gender, String email, long phnum) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phnum = phnum;
	}	
	void eat() {
		System.out.println(name+"is eating");
			}
	void sleep() {
		System.out.println(gender+" "+name+" is sleeping");
	}
	

}
