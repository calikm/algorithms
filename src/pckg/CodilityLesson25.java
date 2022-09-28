package pckg;

import java.util.Arrays;
import java.util.Stack;

public class CodilityLesson25 {
	public static void main(String[] args) {
		
		int[] array = {23171, 21011, 21123, 21366, 21013, 21367};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0 || A.length == 1) {
			return 0;
		}
		
		int[] checkArray = A.clone();
		Arrays.sort(checkArray);
		if (checkArray[0] < 0) {
			return 0;
		}
		
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		stack.push(A[0]);
		for (int i = 0; i < A.length-1; i++) {
			if (A[i+1] < stack.peek()) {
				stack.pop();
				stack.push(A[i+1]);
			} else {
				if (A[i+1] - stack.peek() > max) {
					max = A[i+1] - stack.peek();
				}
			}
		}
		
		
		/*
		 * int max = 0; for (int i = A.length - 1; i >= 0; i--) { for (int j = i - 1; j
		 * >= 0; j--) { if (A[i] - A[j] > max) { max = A[i] - A[j]; } }
		 * 
		 * }
		 */
		System.out.println(max);
		return max;

	
	}

}
