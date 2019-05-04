
public class Teacher extends Person {

	private int numberOfClass;
	private int id;
	
	public Teacher(String tempName, int tempNumberOfClass, int tempId) {
		super(tempName);
		setNumberOfClass(tempNumberOfClass);
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
