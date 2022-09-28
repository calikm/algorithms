package pckg;

import java.util.Arrays;

class CodilityLesson8 {
	public static void main(String[] args) {
		
		int[] array = {2, 3, 2, 1};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1 && A[0] != 1) {
			return 0;
		} 
		
		if (A.length <= 100000 && A.length > 1) {
			Arrays.sort(A);
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] - A[i+1] <= -2 || A[i] - A[i+1] == 0 || A[i] < 1 || A[0] != 1) {
					return 0;
				}
			}
		}
		return 1;
	}

}
