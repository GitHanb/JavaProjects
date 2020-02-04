/**
 * 
 */
package problemDomain;

import java.util.Scanner;

/**
 * @author henryhan
 *
 */
public class PassArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int ARRAY_SIZE = 4;
		
		int[] numbers = new int[ARRAY_SIZE];
		
		getValues(numbers);
		
		System.out.println("Here are the numbers that you entered.");
		
		showArray(numbers);

	}

	private static void getValues(int[] array) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int size = array.length;
		
		System.out.println("Enter a series of " + size + " numbers.");
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = keyboard.nextInt();
		}
		
	}

	private static void showArray(int[] array) {
		int size = array.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
