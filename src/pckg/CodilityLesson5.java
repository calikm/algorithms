package pckg;

import java.util.Arrays;

public class CodilityLesson5 {
	public static void main(String[] args) {
		
		int[] array = {2, 3, 5, 6, 4, 7};
		solution(array);
	}
	
	public static int solution(int[] A) {
	
		int missingInt = 0;
		
		Arrays.sort(A);
		if (A.length == 0 || A[0] != 1) {
			System.out.println(1);
			return 1;
		} else if (A.length == 1) {
			return 2;
		} else {
			if (A.length <= 100000) {
				for (int i = 0; i < A.length - 1; i++) {
					if (A[i] - A[i+1] == -2) {
						missingInt = A[i] + 1;
					}
				}
				if (missingInt == 0) {
					missingInt = A[A.length - 1] + 1;
				}
			}
		}
		System.out.println(missingInt);
		return missingInt;
	}

}
