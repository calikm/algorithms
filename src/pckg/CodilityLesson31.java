package pckg;

import java.util.ArrayList;
import java.util.Arrays;

//81% :)

public class CodilityLesson31 {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		solution(array);
	}
	
	public static int solution(int[] A) {
		
		int[] clone = A.clone();
		Arrays.sort(clone);
		if (clone[0] < 0) {
			return 0;
		}
		
		ArrayList<Integer> peaks = new ArrayList<>();
		for (int i = 1; i < A.length-1; i++) {
			if (A[i] > A[i-1] && A[i] > A[i+1]) {
				peaks.add(i);
			}
		}
		
		if (peaks.size() == 0) {
			return 0;
		} else if (peaks.size() == 1) {
			return 1;
		}
		
		int divCheck = 2;
		boolean primNumber = true;
		while (divCheck * divCheck <= A.length) {
			if (A.length % divCheck == 0) {
				primNumber = false;
				break;
			}
			divCheck++;
		}
		
		if (primNumber == true) {
			return 1;
		}
		
		int maxBlocks = peaks.size();
		int split = 0;
		int result = 0;
		int splitResult = 0;
		int splitCount = 1;
		
		while (1 <= maxBlocks) {
			split = A.length/maxBlocks;
			if (split * maxBlocks == A.length) {
				for (int i = 0; i < peaks.size(); i++) {
					if (i == 0) {
						if (split * splitCount > peaks.get(i)) {
							splitResult++;
							splitCount++;
						} 
					} else {
						if (peaks.get(i) >= split*(splitCount-1) && peaks.get(i) <= split*splitCount) {
							splitResult++;
							splitCount++;
						} 
					}
				}
			}
			if (splitResult == maxBlocks) {
				result = Math.max(result, splitResult);
			}
			maxBlocks--;
			splitResult = 0;
			splitCount = 1;
		}
		System.out.println(result);
		return result;
	}

}
