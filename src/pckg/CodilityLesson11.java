package pckg;

public class CodilityLesson11 {
	public static void main(String[] args) {
		
		int[] array = {0};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		int result = 0;
		
		if (A.length == 0 || A.length == 1) {
			return 0;
		}
		
		if (A.length <= 100000) {
			int[] prefixSums = new int[A.length];
			prefixSums[0] = A[0];
			for (int k = 1; k < A.length; k++) {
				prefixSums[k] = prefixSums[k-1] + A[k];
			}
			
			for (int i = 0; i < A.length; i++) {
				if (A[i] != 0 && A[i] != 1) {
					return 0;
				} else if (A[i] == 0) {
					result += (prefixSums[A.length - 1] - prefixSums[i]);
				}
			}
			if (Math.abs(result) > 1000000000) {
				return -1;
			}
			return result;
		}
		return 0;
	}

}
