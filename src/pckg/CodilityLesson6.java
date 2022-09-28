package pckg;


public class CodilityLesson6 {
	public static void main(String[] args) {
		
		int[] array = {-10, -20, -30, -40, 100};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		int difference = 0;
		
		if (A.length < 2 || A.length > 100000) {
			return 0;
		} else {
			int left = A[0];
			int right = 0;
				for (int i = 1; i < A.length; i++) {
					right += A[i];
				}
				difference = Math.abs(left - right);

				if (A.length > 2) {
					for (int j = 1; j < A.length; j++) {
						left += A[j];
						right -= A[j];
						if (difference > Math.abs(left - right)) {
							difference = Math.abs(left - right);
						}
					}
				}
		return difference;
		}
	}
}
