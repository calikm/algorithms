package pckg;

import java.util.ArrayList;
import java.util.Arrays;

//so apparently you have to use modulo twice here...
//the logic behind is not obvious to me
//first you get the fibonacci number and modulo it using the max from B
//then you modulo it again using the specific index from B
//whats odd is you still calculate the big fib numbers... which can still overflow? how does this fix this problem
//doesnt make sense to me

//this is my code with a slight modification
//quick youtubue video told me "i guessed the max modulo doesnt change the fib sequence from the question" WELL HALLEFUCKINGLUYAH TO YOU BUDDY, asshole.

public class CodilityLesson37 {
	public static void main(String[] args) {
		
		int[] A = {4, 4, 5, 5, 1};
		int[] B = {3, 2, 4, 3, 1};
		solution(A, B);
		
	}
	
	public static int[] solution(int[] A, int[] B) {
		
		int[] result = new int[A.length];
		if (A.length != B.length || A.length == 0) {
			return result;
		}
		

		int[] clone = A.clone();
		Arrays.sort(clone);
		int[] bClone = B.clone();
		Arrays.sort(bClone);
		
		ArrayList<Integer> fib = new ArrayList<>();
		fib.add(1);
		fib.add(1);
		
		for (int i = 2; i <= clone[clone.length-1]+1; i++) {
			fib.add((fib.get(i-1) + fib.get(i-2)) % (int) Math.pow(2, bClone[bClone.length-1]));
		}
		
		for (int i = 0; i < A.length; i++) {
				result[i] = fib.get(A[i]) % (int) Math.pow(2, B[i]);
		}
		
		return result;
		
	}

}
