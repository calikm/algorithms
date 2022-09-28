package pckg;

import java.util.HashSet;

//this is 50%, 100 correctness, terrible performance

public class CodilityLesson39 {
	public static void main(String[] args) {
		
		int A[] = {1, 4, 5, 8};
		int B[] = {4, 5, 9, 10};
		
		int C[] = {1, 4, 6, 7, 10, 2};
		
		solution(A, B, C);
		
	}
	
	public static int solution(int[] A, int[] B, int[] C) {
		
		int start = 1;
		int end = C.length;
		int result = -1;
		
		while (start <= end) {
			
			int mid = (start + end) / 2;
			HashSet<Integer> planks = nailedPlanks(A, B, C, mid);
			if (planks.size() == A.length) {
				result = mid;
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		System.out.println(result);
		return result;
	}
	
	public static HashSet<Integer> nailedPlanks(int[] A, int[] B, int[] C, int mid) {
		
		HashSet<Integer> nails = new HashSet<>();;
		for (int k = 0; k < mid; k++) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] <= C[k] && C[k] <= B[i]) {
					nails.add(i);
				}
			}
		}
		
		return nails;
		
	}

}