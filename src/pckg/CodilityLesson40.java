package pckg;

import java.util.HashSet;

//accidental 100? i dont get why would i try to bother with some weird multiple nested loops within the caterpillar method for this
//not gonna cry about it ;)

public class CodilityLesson40 {
	public static void main(String[] args) {
		
		int[] A = {-5, -3, -1, 0, 3, 6};
		solution(A);
		
	}
	
	public static int solution(int[] A) {
		
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return 1;
		}
		
		HashSet<Integer> dis = new HashSet<>();
		
		for (int i = 0; i < A.length; i++) {
			dis.add(Math.abs(A[i]));
		}
		
		return dis.size();
	}

}