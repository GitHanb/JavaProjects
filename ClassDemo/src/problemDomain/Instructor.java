package problemDomain;

public class Instructor 
{
	
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	public Instructor(String lastName, String firstName, String officeNumber) 
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.officeNumber = officeNumber;
	}
	
	
	public Instructor (Instructor object2) 
	{ 
		this.lastName = object2.lastName;
		this.firstName = object2.firstName; 
		this.officeNumber = object2.officeNumber;
	}
	 
	
	public void set(String lastName, String firstName, String officeNumber)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.officeNumber = officeNumber;
	}

	@Override
	public String toString() {
		String str = "Last Name: " + lastName + 
						"\nFirst Name: " + firstName + 
						"\nOffice Number: " + officeNumber;
		return str;
	}
	
	
	

}
