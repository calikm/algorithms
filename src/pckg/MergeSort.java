package pckg;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] data) {
		
		sortArray(data, 0, data.length - 1);
	}
	
	private static void sortArray(int[] data, int low, int high) {
		if ((high - low) >= 1) {
			int middle1 = (low + high) / 2;
			int middle2 = middle1 + 1;
			
			sortArray(data, low, middle1);
			sortArray(data, middle2, high);
			
			merge (data, low, middle1, middle2, high);
		}
	}
	
	private static void merge(int[] data, int left, int middle1, int middle2, int right) {
		int leftIndex = left;
		int rightIndex = middle2;
		int combinedIndex = left;
		int[] combined = new int[data.length];

		
		while (leftIndex <= middle1 && rightIndex <= right) {
			if (data[leftIndex] <= data[rightIndex]) {
				combined[combinedIndex++] = data[leftIndex++];
			} else {
				combined[combinedIndex++] = data[rightIndex++];
			}
		}
		
		if (leftIndex == middle2) {
			while (rightIndex <= right) {
				combined[combinedIndex++] = data[rightIndex++];
			}
		} else {
			while (leftIndex <= middle1) {
				combined[combinedIndex++] = data[leftIndex++];
			}
		}
		
		for (int i = left; i <= right; i++) {
			data[i] = combined[i];
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		int[] data = {1, 190, 6, 32, 45, 3, 8, 7, 66, 45, 84};
		
		System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data));
		mergeSort(data);
		System.out.printf("Tablica posortowana: %s%n", Arrays.toString(data));
	}
}
