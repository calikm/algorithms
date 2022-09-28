package pckg;

import java.util.Arrays;

public class CodilityLesson26 {
	public static void main(String[] args) {
		
		int[] array = {-2, -2};
		solution(array);
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return A[0];
		}
		
		int max = 0;
		int maxSlice = 0;
		
		for (int num : A) {
			max = Math.max(num, max + num);
			maxSlice = Math.max(maxSlice, max);
		}
		if (maxSlice == 0) {
			Arrays.sort(A);
			return A[A.length - 1];
		}
		return maxSlice;
	}

}