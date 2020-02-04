package problemDomain;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int position = binarySearch(numbers, 11);
		
		if(position == -1) {
			System.out.println("Not found!");
			return;
		} 
		
		System.out.println(position);

	}
	
	private static int binarySearch(int[] array, int value) {
		int first;
		int last;
		int middle;
		int position;
		boolean found;
		
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		
		while(!found && first<=last) {
			middle = (first + last) / 2;
			if(array[middle] == value) {
				found = true;
				position = middle;
			} else if (array[middle] > value) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		}
		
		return position;
	}

}
