
public class Teacher extends Person {

	private int numberOfClass = 3;
	private int id;
	
	public Teacher(String tempName, int tempId) {
		super(tempName);
		setNumberOfClass(numberOfClass);
		setId(tempId);
		Main.teacherid++;
	}

	public int getNumberOfClass() {
		return numberOfClass;
	}

	public void setNumberOfClass(int numberOfClass) {
		this.numberOfClass = numberOfClass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
