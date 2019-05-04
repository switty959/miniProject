
public class Student extends Person {
	private int maxClasses =4 ;
	private int numberOfclasses=0;
	private int id;
	private String[] courses = new String[maxClasses];
	private int[] grades = new int[maxClasses];
	private int[] examGrades = new int[maxClasses];

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
	
	public int[] getExamGrades() {
		return examGrades;
	}


	public void setExamGrades(int[] examGrades) {
		this.examGrades = examGrades;
	}

	public void enrollSubject(int id)
	{
		if(numberOfclasses <= maxClasses)
		{
			courses[numberOfclasses] = Main.subjects[id].getName();
			numberOfclasses++;
		}
		else
		{
			System.out.println(getName() + " have too many subjects atm, please remove one");
		
		}
	}
	
	public void unenrollSubject(int id)
	{
		courses[id] = null;
		numberOfclasses--; 
	}
	public void gradeAssignment(int id, int input)
	{
		this.grades[id] = input;
	}
	
	public void gradeExam(int id, int input)
	{
		this.examGrades[id] = input;
	}
	
	public void checkSubjects()
	{
		for(int i = 0; i<numberOfclasses;i++)
		{
			System.out.println(this.getName()+" has " + this.courses[i]);
		}
		
	}
	public String printAssignemtGrade(int id)
	{
		String text = this.getName()+" got a "+ this.grades[id]+ " in " + this.courses[id];
		return text;
	}
	
	public String printExamGrade(int id)
	{
		String text = this.getName()+" got a "+ this.grades[id]+ " in " + this.courses[id]+" exam";
		return text;
	}


	
}
