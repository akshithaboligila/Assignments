
public class Book {
	int yearpublished;
	String title;
	String author;
	String genre;
	String plot;
	String setting;
	int rating;
	String language;
	String font;
	int edition;
	
	void motivate() {
		System.out.println(title+" which is written by "+author+" is the best motivational book");
	}
	void  educate() {
		System.out.println("The book which is published in "+yearpublished+" is based on "+genre+" genre educates people");
	
	}
	public Book(int yearpublished, String title, String author, String genre, String plot, String setting, int rating,
			String language, String font, int edition) {
		super();
		this.yearpublished = yearpublished;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.plot = plot;
		this.setting = setting;
		this.rating = rating;
		this.language = language;
		this.font = font;
		this.edition = edition;
	}

}
