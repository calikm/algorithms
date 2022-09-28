package pckg;

public class QuickSort {
	
	public static int[] array = {4, 2, 1, 3, 8, 10, 5, 6, 7, 9};
	
	public static void main(String[] args) {
		
		System.out.println("Array przed sortowaniem: ");
		for (int i : array) {
			System.out.printf("%d ", i);
		}
		
		quickSort(array, 0, array.length-1);
		
		System.out.println("Array po sortowaniu: ");
		for (int i : array) {
			System.out.printf("%d ", i);
		}
	}
	
	public static void quickSort(int[] array, int start, int end) {
		
		if (start < end) {
			int partitionIndex = partition(array, start, end);
			
			quickSort(array, start, partitionIndex-1);
			quickSort(array, partitionIndex+1, end);
		}
		
	}
	
	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start - 1;
		
		for (int k = start; k < end; k++) {
			if (array[k] <= pivot) {
				i++;
				int swapTemp = array[i];
				array[i] = array[k];
				array[k] = swapTemp;
			}
		}
		
		int swapTemp = array[i+1];
		array[i+1] = array[end];
		array[end] = swapTemp;
		
		return i+1;
		
	}

}
