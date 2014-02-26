package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		int[] sorted = new int[unsortedArray.length];
		for(int i=0;i<sorted.length;i++){
			sorted[i] = unsortedArray[i];
		}
		for(int i=0; i<sorted.length; i++){
			int current = i;
			for(int j=0;j<=i;j++){
				if(sorted[current] < sorted[j]){
					int temp = sorted[j];
					sorted[j] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		return sorted;
	}
}
