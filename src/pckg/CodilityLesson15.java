package pckg;

import java.util.HashSet;
import java.util.Set;

public class CodilityLesson15 {
	public static void main(String[] args) {
		
		int[] array = {2, 1, 1, 2, 3, 1};
		solution(array);
		
	}
	
	public static int solution(int[] A) {
		
		Set<Integer> distinct = new HashSet<>();
		
		for (int i = 0; i < A.length; i++) {
			distinct.add(A[i]);
		}
		return distinct.size();

	}

}
