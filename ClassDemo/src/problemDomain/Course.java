package problemDomain;

public class Course
{
	private String courseName;
	private Instructor instructor;
	private TextBook textBook;
	
	public Course(String courseName, Instructor instructor, TextBook textBook)
	{
		this.courseName = courseName;
		this.instructor = new Instructor(instructor);
		this.textBook = new TextBook(textBook);
	}
	
	public String getName()
	{
		return this.courseName;
	}
	
	public Instructor getInstructor()
	{
		return new Instructor(instructor);
	}
	
	public TextBook getTextBook()
	{
		return new TextBook(textBook);
	}
	
	public String toString()
	{
		String str = "Course name: " + courseName + 
					"\nInstructor information:\n" + instructor + 
					"\nTextbook information:\n" + textBook;
		
		return str;
	}
}
