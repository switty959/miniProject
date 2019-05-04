import java.io.Console;

public class Main {
	public static int studentid =0;
	public static int teacherid =0;
	public static int[] grades  = {-3,00,02,4,7,10,12}; 
	private static String[] studentNames = {"Frederick Puckett","Allan Chase","Clarence Christian","Jimmy McFadden","Randolph Richard",
									 "Maurice Beck","Theodore Simon","Harold Walter","Ricardo Foley","Roberto Lewis"};
	
	private static String[] teacherNames = {"Nicklas Olsen","Jonas Sørensen","Shaina Bevilacqua","Sharolyn Herbig","Audry Jessie",
			 "Hermina Hemming","Lita Deemer"};
	

    private static String[] subjectsName = {"Danish","Maths","Culinary Arts","P.E."};
    static Student students[] = new Student[studentNames.length];
    static Teacher teachers[] = new Teacher[studentNames.length];
    static Classes subjects[] = new Classes[subjectsName .length];
    

	
	public static void main(String[] args) 
	{
		makeStudents();
		makeSubjects();
		addStudentToSubject();
		students[7].checkSubjects();
		students[7].gradeAssignment(0, grades[5]);
		students[7].gradeExam(0, grades[3]);
		System.out.println(students[7].printExamGrade(0));
		System.out.println(students[7].printAssignemtGrade(0));
	}
	

	public static void makeStudents()
	{
		
		System.out.println("Students");
		System.out.println("----------------------");
		for(int i = 0;i<studentNames.length;i++)
		{
			students[i] = new Student(studentNames[i],studentid+1);
			System.out.println("Student name: "+students[i].getName());
			System.out.println("Student id: "+students[i].getId());
			System.out.println("----------------------");
		}
	}
	public static void makeTeachers()
	{
		
		System.out.println("Teachers");
		System.out.println("----------------------");
		for(int i = 0;i<teacherNames.length;i++)
		{
			teachers[i] = new Teacher(teacherNames[i],teacherid+1);
			System.out.println("teacher's name: "+teachers[i].getName());
			System.out.println("teacher's id: "+teachers[i].getId());
			System.out.println("----------------------");
		}
	}
	private static void makeSubjects() {
		
		System.out.println("Subjects");
		System.out.println("----------------------");
		for(int i = 0;i<subjectsName.length;i++)
		{
			subjects[i] = new Classes(subjectsName[i]);
			System.out.println("subject's title: "+subjects[i].getName());
			System.out.println("----------------------");
		}
		
	}
	
	private static void addStudentToSubject()
	{
		
		for(int i =0; i<students.length;i++)
		{
			students[i].enrollSubject(1);
		}
	}
	
	
}
