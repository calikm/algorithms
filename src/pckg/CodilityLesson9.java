package pckg;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class CodilityLesson9 {
	public static void main(String[] args) {
		
		int[] array = {3, 4, 4, 6, 1, 4, 4};
		
		solution(5, array);
		
	}
	
	public static int[] solution(int N, int[] A) {
		
		int[] counters = new int[N];
		int maxCounter = 0;
		
		if (A.length == 0 || N == 0) {
			return counters;
		}
		if (A.length == 1 && A[0] <= N) {
			counters[A[0] - 1] += 1;
			return counters;
		}
		
		if (A.length <= 100000 && N <= 100000) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] <= N + 1 && A[i] >= 1) {
					if (A[i] > N) {
						Arrays.fill(counters, maxCounter);
					} else {
						counters[A[i] - 1] += 1;
						if (maxCounter < counters[A[i] - 1]) {
							maxCounter = counters[A[i] - 1];
						}
					}
				}

			}
		}
		return counters;
	}

}
