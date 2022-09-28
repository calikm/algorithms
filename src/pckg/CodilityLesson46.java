package pckg;

//had to google - didnt think of doing it this way... felt like the reading didnt provide any benefits...
//the concept is simple - you craete a second array, store the max possible value (should be the sum) in the particular position and check the previous (up to ) six positions
//for the max possible value
public class CodilityLesson46 {
	public static void main(String[] args) {
		
		int[] A = {-2, 5, 1};
		solution(A);
		
	}
	
	public static int solution(int[] A) {
		
		int[] res = new int[A.length];
		
		for (int i = 0; i < res.length; i++) {
			if (i == 0) {
				res[i] = A[i];
			} else {
				int maxInThisPosition = Integer.MIN_VALUE;
				for (int j = 1; j <= 6; j++) {
					if (i - j >= 0) {
						maxInThisPosition = Math.max(maxInThisPosition, res[i-j] + A[i]);
					}
				}
				res[i] = maxInThisPosition;
			}
			
			
		}
		return res[res.length-1];
	}

}
