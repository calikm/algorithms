package pckg;

import java.util.Arrays;

public class CodilityLesson17 {
	public static void main(String[] args) {
		
		int[] array = {10, 2, 5, 1, 8, 20};
		//5, 8, 10
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		int result = 0;
		if (A.length < 3) {
			return 0;
		}
		
		if (A.length <= 100000) {
			Arrays.sort(A);
			for (int i = 0; i < A.length - 2; i++) {
				if (A[i] + A[i+1] > A[i+2] && A[i+1] + A[i+2] > A[i] && A[i+2] + A[i] > A[i+1]) {
					return 1;
				}
			}
		}
		return result;
	}

}
