//inside of Sculpture.java
public class Sculpture extends Art {
//TODO: implement Sculpture class
	private double height;
	private double width;
	private double depth;
	
	public Sculpture(String title, String author, String description, double height, double width, double depth) {
		super(title, author, description);
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	@Override
	public void viewArt() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Description: " + description);
		System.out.println("Dimensions: " + height + " x " + width + " x " + depth);
	}
}
