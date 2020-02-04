package problemDomain;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = {5, 7, 2, 8, 9, 1};
		
		selectionSort(numbers);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}
	
	private static void selectionSort(int[] array) {
		int startScan, index, minIndex, minValue;
		
		for(startScan=0; startScan<(array.length-1); startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			for(index=startScan+1; index<array.length; index++) {
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
	}

}
