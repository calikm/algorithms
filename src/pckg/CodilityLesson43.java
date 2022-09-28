package pckg;

import java.util.Arrays;

//63%

public class CodilityLesson43 {
	public static void main(String[] args) {
		
		//{-8, 4, 5, -10, 3};
		//should be 3
		
		int[] A = {1, 4, -3};
		//should be 1
		solution(A);
		
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return Math.abs(A[0] + A[0]);
		}
		
		int min = Math.abs(A[0] + A[0]);
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			min = Math.min(min, Math.abs(A[i] + A[i]));
			min = Math.min(min, Math.abs(A[i] + A[A.length-1]));
			min = Math.min(min, Math.abs(A[0] + A[A.length-1-i]));
			min = Math.min(min, Math.abs(A[i] + A[A.length-1-i]));
			if (A.length/2-i >= 0 && A.length/2+i < A.length) {
				min = Math.min(min, Math.abs(A[A.length/2-i] + A[A.length/2+i]));
			}
			if (i + 1 < A.length) {
				min = Math.min(min, Math.abs(A[i] + A[i+1]));
			}
		}
		return min;
	}

}
