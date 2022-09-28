package pckg;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] array = {1, 4, 7, 2, 4, 5, 6, 8, 9, 10};
		
		System.out.println("Elementy w array to: ");
		for(int i : array) {
			System.out.printf("%d ", i);
		}
		
		System.out.printf("%n%n");
		Arrays.sort(array);
		
		System.out.println("Elementy w posrtowanym array to: ");
		for(int i : array) {
			System.out.printf("%d ", i);
		}
		
		System.out.printf("%n%n");
		//wyszukaj pozycje liczby ktora chcemy zgadnac
		int shot = 2;
		int low = 0;
		int high = array.length - 1;
		int result = -1;
		
		while (result == -1 && (low <= high)) {
			int mid = (low + high)/2;
			if (array[mid] == shot) {
				result = mid;
			} else if (array[mid] > shot) {
				high = mid - 1;
				System.out.println(high);
			} else {
				low = mid + 1;
				System.out.println(low);
			}
		}
		if (result == -1) {
			System.out.println("Nie znaleziono liczby");
		} else {
			System.out.println("pozycja " + shot + " w array to : " + result);
		}
		
		
	}

}
