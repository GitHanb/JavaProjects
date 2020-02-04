package problemDomain;

import java.util.Scanner;

public class PersonSearch
{

	public static void main(String[] args)
	{
		String lookUp;
		
		String[] people = { "Cutshaw, Will", "Davis, George",
							"Davis, Jenny", "Russert, Phil", 
							"Russell, Cindy", "Setzer, Charles",
							"Smathers, Holy", "Smith, Chris",
							"Smith, Brad", "Williams, Jean"};
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the first few characters of the last name to look up: ");
		
		lookUp = keyboard.nextLine();
		System.out.println("Here are the names that match:");
		
		for(String person: people)
		{
			if(person.startsWith(lookUp))
			{
				System.out.println(person);
			}
					
		}

	}

}
