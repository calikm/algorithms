package pckg;

import java.util.ArrayDeque;
import java.util.Deque;

//100 :)

public class CodilityLesson44 {
	public static void main(String[] args) {
		
		int[] A = {1, 3, 7, 9, 9};
		int[] B = {5, 6, 8, 9, 10};
		solution(A,B);
		
	}
	
	public static int solution(int[] A, int[] B) {
		
		if (A.length == 0) {
			return 0;
		}
		
		if (A.length == 1) {
			return 1;
		}
		
		int resLeft = 1;
		int resRight = 1;
		Deque<Integer> ends = new ArrayDeque<>();
		ends.add(B[0]);
		
		for (int i = 0; i < A.length-1; i++) {
			if (A[i+1] > ends.getFirst()) {
				resLeft++;
				ends.addFirst(B[i+1]);
			} else if (A[i+1] > ends.getLast()) {
				resRight++;
				ends.addLast(B[i+1]);
			} 
		}
		
		int result = Math.max(resLeft, resRight);
		return result;
	}

}
