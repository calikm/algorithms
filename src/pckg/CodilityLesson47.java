package pckg;

public class CodilityLesson47 {
	public static void main(String[] args) {
		
		int[] A = {3, 3, 3, 4, 5};
		solution(A);
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return A[0];
		}
		int[] res = new int[A.length]; 
		int[] lSums = new int[A.length];
		int[] rSums = new int[A.length];
		
		lSums[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			lSums[i] += A[i] + lSums[i-1];
		}
		
		rSums[A.length-1] = A[A.length-1];
		for (int i = A.length-2; i >= 0; i--) {
			rSums[i] += A[i] + rSums[i+1];
		}
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				res[0] = A[0];
			} else {
				res[i] = Math.abs(A[i]) - Math.abs(res[i-1]);
				if (i+1 < A.length) {
					if (lSums[i] == rSums[i+1] || rSums[i] == lSums[i+1]) {
						return 0;
					} else {
						min = Math.min(min, Math.abs(lSums[i] - rSums[i+1]));
						min = Math.min(min, Math.abs(lSums[i+1] - rSums[i]));
					}
				}
				
			}
		}
		
		if (res[res.length-1] == 0) {
			return 0;
		}
		
		return Math.min(min, Math.abs(res[res.length-1]));
	}
}
