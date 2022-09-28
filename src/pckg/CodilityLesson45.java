package pckg;

//100

public class CodilityLesson45 {
	public static void main(String[] args) {
		
		int[] A = {1, 2, 3, 4, 1, 1, 3};
		solution(4, A);
		
	}
	
	public static int solution(int K, int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		
		if (A.length == 1) {
			if (A[0] >= K) {
				return 1;
			}
		}
		
		int result = 0;
		int sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			
			if (A[i] >= K) {
				result++;
			} else {
				if (i < A.length-1) {
					if (i == A.length-1) {
						if (A[i+1] >= K) {
							result++;
							break;
						}
					}
					sum = A[i] + A[i+1];
					if (sum >= K) {
						result++;
						i++;
					} else {
						A[i+1] += A[i];
					}
				}

			}
		}
		return result;
	}

}
