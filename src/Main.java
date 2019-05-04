
public class Main {
	public static int studentid =0;
	public static int teacherid =0;
	
	private static String[] studentNames = {"Frederick Puckett","Allan Chase","Clarence Christian","Jimmy McFadden","Randolph Richard",
									 "Maurice Beck","Theodore Simon","Harold Walter","Ricardo Foley","Roberto Lewis"};
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		makeStudents();
	}
	
	public static void makeStudents()
	{
		Student students[] = new Student[studentNames.length];
		for(int i = 0;i<studentNames.length;i++)
		{
			students[i] = new Student(studentNames[i],studentid+1);
			System.out.println("Student name: "+students[i].getName());
			System.out.println("Student id: "+students[i].getId());
			System.out.println("----------------------");
		}
	}

}
