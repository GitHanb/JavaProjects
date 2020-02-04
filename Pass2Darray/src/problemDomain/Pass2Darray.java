package problemDomain;

public class Pass2Darray {

	public static void main(String[] args) {
		int[][] numbers = {	{1, 2, 3, 4},
							{5, 6, 7, 8},
							{9, 10,	11, 12}};
		System.out.println("Here are the values in the array.");
		
		showArray(numbers);
		
		System.out.println("The sume of the values is " + arraySum(numbers));
		
	}
	
	private static void showArray(int[][] array) {
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	private static int arraySum(int[][] array) {
		int total = 0;
		
		for(int row=0; row<array.length; row++) {
			for(int col=0; col<array[row].length; col++) {
				total += array[row][col];
			}
		}
		return total;
	}

}
