package pckg;

import java.util.Arrays;

public class CodilityLesson23 {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 1};
		solution(array);
		
	}
	
	//interesting, somehow this has only 91% - one error is related to malfunctioning binarySearch, which somehow is not able to find the c[c.length/2] 
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return -1;
		}
		if (A.length == 1) {
			return 0;
		}
		if (A.length == 2) {
			if (A[0] == A[1]) {
				return 0;
			} else {
				return -1;
			}
		}
		
		int count = 1;
		
		if (A.length <= 100000) {
			int[] c = A.clone();
			Arrays.sort(c);
			for (int i = c.length/2; i > 0; i--) {
				if (c[c.length/2] == c[i-1]) {
					count++;
				}
				if (c[c.length/2] == c[c.length/2 + c.length/2 - i]) {
					count++;
				}
				if (count > c.length/2) {
					return Arrays.binarySearch(A, c[c.length/2]);
				}
			}
		}
		return -1;
	}
		
}


