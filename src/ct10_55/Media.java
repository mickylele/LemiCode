package ct10_55;

public abstract class Media {

	String title;
	int length;
	
	public Media(String title,int length) {
		this.title = title;
		this.length = length;
	}
	
	abstract void displayInfo();
}
