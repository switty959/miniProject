
public class Classes {

	public int numberOfStudents = 0;
	private int maxNumberOfStudents = 25;
	private String name;
	public Classes() {
		setName("test class");
	}
	public Classes(String tempName)
	{
		setName(tempName);
	}
	public int getMaxNumberOfStudents() {
		return maxNumberOfStudents;
	}
	public void setMaxNumberOfStudents(int maxNumberOfStudents) {
		this.maxNumberOfStudents = maxNumberOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
