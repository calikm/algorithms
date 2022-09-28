package pckg;

import java.util.Set;
import java.util.TreeSet;

public class CodilityLesson10 {
	public static void main(String[] args) {
		
		int[] array = {1, -5, 3, 5, 4, 1, 2, 1000000};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return 1;
		}
		if (A.length == 1) {
			if (A[0] != 1) {
				return 1;
			} else {
				return 2;
			}
		}
		Set<Integer> sortedIntegers = new TreeSet<>();
		
		if (A.length <= 100000) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] <= 0) {
					continue;
				}
				sortedIntegers.add(A[i]);
			}
		
			if (!sortedIntegers.contains(1)) {
				return 1;
			}
			Object[] sortedArray = sortedIntegers.toArray();
			for (int j = 0; j < sortedArray.length - 1; j++) {
				if ((int) sortedArray[j+1] - (int) sortedArray[j] > 1) {
					System.out.println((int) sortedArray[j] + 1);
					return (int) sortedArray[j] + 1;
				} 
			}
			for (int number : sortedIntegers) {
				System.out.printf("%d ", number);
			}
			return (int) sortedArray[sortedArray.length - 1] + 1;
		}
		return 1;
	}

}
