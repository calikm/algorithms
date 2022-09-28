package pckg;

public class SelectSort {
	
	public static int[] array = {5, 3, 1, 2, 4, 10, 8, 7, 6, 9};
	
	public static void main(String[] args) {
		
		int[] sortedArray = new int[10];
		
		for(int j = 0; j < sortedArray.length; j++) {
			sortedArray[j] = findSmallest(array);
		}
		
		for(int k : sortedArray) {
			System.out.printf("%d ", k);
		}
	
	}
	
	public static int findSmallest(int[] array) {
		
		int smallest = array[0];
		int smallestIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
				smallestIndex = i;
			}
		}
		array[smallestIndex] = 100;
		return smallest;
	}

}
/*different implementation of this algorythm
 * 
 * import java.util.Arrays; import java.security.SecureRandom; import
 * java.util.Arrays;
 * 
 * public class SelectionSortTest {
 * 
 * public static <T extends Comparable<T>> void selectionSort(T[] data) {
 * 
 * for (int i = 0; i < data.length - 1; i++) { int smallest = i;
 * 
 * for (int index = i + 1; index < data.length; index++) { if
 * (data[index].compareTo(data[smallest]) < 0) { smallest = index; } }
 * 
 * swap(data, i, smallest); printPass(data, i + 1, smallest); } }
 * 
 * 
 * private static <T> void swap(T[] data, int first, int second) { T temporary =
 * data[first]; data[first] = data[second]; data[second] = temporary; }
 */
