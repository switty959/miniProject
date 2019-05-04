
public class Student extends Person {
	private int maxClasses = 10;
	private int numberOfclasses=0;
	private int id;
	private String[] courses = new String[maxClasses];
	private int[] grades = new int[maxClasses];

	public Student(String tempName, int tempId) {
		super(tempName);
		setId(tempId);
		Main.studentid++;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}


	public int getNumberOfclasses() {
		return numberOfclasses;
	}


	public void setNumberOfclasses(int numberOfclasses) {
		this.numberOfclasses = numberOfclasses;
	}
	
	public void addClass(String className)
	{
		
	}

}
