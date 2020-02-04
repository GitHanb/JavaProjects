/**
 * 
 */
package problemDomain;

import java.util.Scanner;

/**
 * @author henryhan
 *
 */
public class PayArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		
		int[] hours = new int[EMPLOYEES];
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the hours worked by " + EMPLOYEES + " employees "
				+ "who all earn the same hourly rate.");
		
		for (int i=0; i<EMPLOYEES; i++) {
			System.out.print("Employee #" + (i+1) + ": ");
			hours[i] = keyboard.nextInt();
		}
		
		System.out.print("Enter the hourly rate for each employee: ");
		payRate =keyboard.nextDouble();
		
		System.out.println("Here is each employee's gross pay:");
		for (int i=0; i<EMPLOYEES; i++) {
			grossPay = hours[i] * payRate;
			System.out.println("Employee #" + (i+1) + ": $" + grossPay);
		}
	}

}
