package examples;

public class Boy {
	
	private String name;
	private boolean isFunny;
	private boolean isEmotionallyAvailable;

	public Boy(String name, boolean isFunny, boolean isEmotionallyAvailable) {
		super();
		this.name = name;
		this.isFunny = isFunny;
		this.isEmotionallyAvailable = isEmotionallyAvailable;
	}

	public boolean isEmotionallyAvailable() {
		return isEmotionallyAvailable;
	}

	public boolean isFunny() {
		return isFunny;
	}
	
	public String toString(){
		return name ;
	}
}
