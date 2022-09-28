package pckg;

import java.util.Arrays;

public class CodilityLesson16 {
	public static void main(String[] args) {
		
		int[] array = {1, -100, -5, 5, 8};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		int result = 0;
		
		if (A.length < 3) {
			return 0;
		}
		
		if (A.length <= 100000) {
			Arrays.sort(A);
			if (A[A.length-3] >= -1000 && A[A.length-3] <= 1000 && A[A.length-2] >= -1000 && A[A.length-2] <= 1000 && A[A.length-1] >= -1000 && A[A.length-1] <= 1000) {
				if (A[0]*A[1]*A[A.length-1] > A[A.length-3]*A[A.length-2]*A[A.length-1]) {
					System.out.println(A[0]*A[1]*A[A.length-1]);
					return A[0]*A[1]*A[A.length-1];
				} else {
					System.out.println(A[A.length-3] * A[A.length-2] * A[A.length-1]);
					return A[A.length-3] * A[A.length-2] * A[A.length-1];
				}
			}
		}
		return result;
		
	}

}
