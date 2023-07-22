import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yearpublished");
		int yearpublished = scan.nextInt();
		System.out.println("Enter title");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("Enter author");
		
		String author = scan.nextLine();
		System.out.println("Enter genre");
		
		String genre = scan.nextLine();
		System.out.println("Enter plot");
		
		String plot = scan.nextLine();
		System.out.println("Enter setting");
		
		String setting = scan.nextLine();
		System.out.println("Enter rating");
		int rating = scan.nextInt();
		System.out.println("Enter language");
		String language = scan.next();
		System.out.println("Enter font");
		scan.nextLine();
		String font = scan.nextLine();
		System.out.println("Enter edition");
		int edition = scan.nextInt();
		
		
		Book b = new Book(yearpublished, title, author, genre, plot, setting, rating, language, font, edition); 
		System.out.println(b.yearpublished+" ,"+b.title+" ,"+b.author+" ,"+b.genre+" ,"+b.plot+" ,"+b.setting+" ,"+b.rating+" ,"+b.language+" ,"+b.font+" ,"+b.edition);
		b.motivate();
		b.educate();
		scan.close();
		
	}

}
