package week1.day1;

public class Student {
	
	String studentName="Anu";
	int studentRollNo=10;
	
	public void college()
	{
		
	
		System.out.println("Student Name=" +studentName);
		System.out.println("Student Rollno=" +studentRollNo);
	}

	
	public int totalMarks()
	{
		int subject1 =80;
		int subject2 =90;
		int subject3=100;
		int total= subject1 + subject2 +subject3;
		System.out.println("Student total score is:" +total);
		return total;
	
	
	}
	
	public void result()
	{
		String result="Pass";
		System.out.println("Student Result= " +result);
	}
	
	public static void main(String[] args)
	
	{
	    //String result="Pass";
		Student object=new Student();
		object.college();
		
	   object.totalMarks();
		object.result();
		
		//String status=object.result;
		//System.out.println(status);
	}
}
