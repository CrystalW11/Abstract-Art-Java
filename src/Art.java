// inside of Art.java
public abstract class Art {
	// TODO: implement Art Class
	protected String title;
	protected String author;
	protected String description;
	
	public Art(String title, String author, String description) {
		this.title = title; 
		this.author = author;
		this.description = description;
	}
	
	public abstract void viewArt();
}
