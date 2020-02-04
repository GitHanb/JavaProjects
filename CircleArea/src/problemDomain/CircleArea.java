/**
 * 
 */
package problemDomain;

import java.util.Scanner;

/**
 * @author henryhan
 *
 */
public class CircleArea
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double radius;
		double area;
		String input;
		char choice;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter the circle's radius:");
			radius = keyboard.nextDouble();
			
			//consume the remmaining newline character
			keyboard.nextLine();
			
			area = Math.PI * radius * radius;
			
			System.out.printf("The area is %.2f.\n", area);
			
			System.out.print("Do you want to do this again? (Y or N): ");
			
			input = keyboard.nextLine();
			
			choice = input.charAt(0);
			
		}while(Character.toUpperCase(choice) == 'Y');
		
		System.out.println("You are done.");
		System.exit(0);

	}

}
