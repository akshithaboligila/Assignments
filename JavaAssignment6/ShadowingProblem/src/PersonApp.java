import java.util.*;
public class PersonApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = scan.nextInt();
		System.out.println("Enter name:");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter gender:");
		String gender = scan.next();
		System.out.println("Enter email:");
		String email = scan.next();
		System.out.println("Enter phnum:");
		long phnum=scan.nextLong();
		
		Person p = new Person(id, name, gender, email, phnum);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email+" "+p.phnum);
		
		scan.close();
	}

}
