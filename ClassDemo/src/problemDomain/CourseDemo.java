package problemDomain;

public class CourseDemo
{
	public static void main(String[] args)
	{
		Instructor myInstructor = new Instructor("Han", "Henry", "6577 Nolan St");
		TextBook myTextBook = new TextBook("Starting out with Java", "Gaddis", "Pearson");
		Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
		
		System.out.println(myCourse);
		
	}
}
