package pckg;

public class CodilityLesson13 {
	public static void main(String[] args) {
		
		String sequence = "GT";
		int[] pa = {0, 0, 1};
		int[] qa = {0, 1, 1};
		
		solution(sequence, pa, qa);
		
	}
	
	//mine was slow, below is a faster solution with prefix sums
	
	public static int[] solution(String S, int[] P, int[] Q) {
		
		int[] result = new int[P.length];
		
		if (S.isEmpty() || P.length == 0 || Q.length == 0 || S.length() > 100000 || P.length > 50000 || P.length != Q.length) {
			result = new int[0];
			return result;
		}
		int[] impactFactor = new int[S.length()];

		for (int i = 0; i < S.length(); i++) {
			
			switch (S.charAt(i)) {
			case 'A':
				impactFactor[i] = 1;
				break;
			case 'C':
				impactFactor[i] = 2;
				break;
			case 'G':
				impactFactor[i] = 3;
				break;
			case 'T':
				impactFactor[i] = 4;
				break;
			default :
				result = new int[0];
				return result;
			}
		}
		
		for (int k = 0; k < P.length; k++) {
			if (P[k] <= Q[k] && P[k] >= 0 && P[k] < S.length() && Q[k] >= 0 && Q[k] < S.length()) {
				if (impactFactor[P[k]] == 1 || impactFactor[Q[k]] == 1) {
					result[k] = 1;
				} else if (P[k] == Q[k]) {
					result[k] = impactFactor[P[k]];
				} else {
					result[k] = impactFactor[P[k]];
					for (int j = P[k]; j <= Q[k]; j++) {
						if (result[k] > impactFactor[j]) {
							result[k] = impactFactor[j];
						}
					}
				}
			} else {
				result = new int[0];
				return result;
			}
		}
		return result;
	}

}


/*
 * my solution is poor in performance - On2 - it should be done with the prefix
 * sums, like below However, i still dont get it how would you come up with this
 * and compare it this way. I understand it works, but to come up with this?
 * different story
 * 
 * package pckg;
 * 
 * public class CodilityLesson14 { public static void main(String[] args) {
 * 
 * String sequence = "CAGCCTA"; int[] pa = {2, 5, 0, 1}; int[] qa = {4, 5, 6,
 * 3};
 * 
 * solveGenomicRange(sequence, pa, qa); }
 * 
 * public static int[] solveGenomicRange(String S, int[] P, int[] Q) { //used
 * jagged array to hold the prefix sums of each A, C and G genoms //we don't
 * need to get prefix sums of T, you will see why. int[][] genoms = new
 * int[3][S.length()+1]; //if the char is found in the index i, then we set it
 * to be 1 else they are 0 //3 short values are needed for this reason short a,
 * c, g; for (int i=0; i<S.length(); i++) { a = 0; c = 0; g = 0; if ('A' ==
 * (S.charAt(i))) { a=1; } if ('C' == (S.charAt(i))) { c=1; } if ('G' ==
 * (S.charAt(i))) { g=1; } //here we calculate prefix sums. To learn what's
 * prefix sums look at here https://codility.com/media/train/3-PrefixSums.pdf
 * genoms[0][i+1] = genoms[0][i] + a; genoms[1][i+1] = genoms[1][i] + c;
 * genoms[2][i+1] = genoms[2][i] + g;
 * 
 * } for (int[] array : genoms) { for (int number : array) {
 * System.out.printf("%d ", number); } System.out.println(); }
 * System.out.println();
 * 
 * int[] result = new int[P.length]; //here we go through the provided P[] and
 * Q[] arrays as intervals for (int i=0; i<P.length; i++) { int fromIndex =
 * P[i]; //we need to add 1 to Q[i], //because our genoms[0][0], genoms[1][0]
 * and genoms[2][0] //have 0 values by default, look above genoms[0][i+1] =
 * genoms[0][i] + a; int toIndex = Q[i]+1; if (genoms[0][toIndex] -
 * genoms[0][fromIndex] > 0) { result[i] = 1; } else if (genoms[1][toIndex] -
 * genoms[1][fromIndex] > 0) { result[i] = 2; } else if (genoms[2][toIndex] -
 * genoms[2][fromIndex] > 0) { result[i] = 3; } else { result[i] = 4; } }
 * 
 * for (int number : result) { System.out.printf("%d ", number); } return
 * result; } }
 */
