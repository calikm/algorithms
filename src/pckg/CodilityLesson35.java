package pckg;


//this is a 69% 
//spent already like 2 hours on it, googled the 100
public class CodilityLesson35 {
	public static void main(String[] args) {
		
		int[] array1 = {15, 10, 3};
		int[] array2 = {75, 30, 5};
		
		solution(array1, array2);
		
	}
	
	public static int solution(int[] A, int[] B) {
		
		
		if (A.length < 1 || A.length != B.length || A.length > 6000) {
			return 0;
		}
		
		int result = A.length;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > B[i]) {
				if (B[i] == 1) {
					result--;
					continue;
				}
				if (A[i] % B[i] == 0) {
					int div = A[i] / B[i];
					if (A[i] % div != 0 || B[i] % div != 0) {
							result--;
							if (div % B[i] == 0) {
								result++;
							}
					}
				} else {
					result--;
				}
			} else if (B[i] > A[i]) {
				if (A[i] == 1) {
					result--;
					continue;
				}
				if (B[i] % A[i] == 0) {
					int div = B[i] / A[i];
					if (B[i] % div != 0 || A[i] % div != 0) {
							result--;
							if (div % A[i] == 0) {
								result++;
							}
					}
				} else {
					result--;
				}
			} else {
				continue;
			}
		}
		return result;
		
	}

}
