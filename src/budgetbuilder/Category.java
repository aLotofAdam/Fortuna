package budgetbuilder;

public abstract class Category {
	String name;
	int popularity;
	String type;
	
	public Category(String name, String type) {
		this.name = name;
		popularity = 0;
		this.type = type;
	}
	
	public String toString() {
		return name + " " + popularity + " " + type;
	}
}
