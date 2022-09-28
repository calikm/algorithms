package pckg;


import java.util.Arrays;


public class CodilityLesson3 {
	public static void main(String[] args) {
		
		int[] array = {9, 3, 9, 3, 9, 7, 9};
		solution(array);
	}
	
	public static int solution(int[] A) {
		
		int a = 0;
		boolean check = false;
		
		for (int number : A) {
			if (number < 1 || number > 1000000000) {
				check = true;
			}
		}
		
		if (A.length % 2 == 1 && A.length > 0 && A.length < 1000000 && check == false) {
		
			Arrays.parallelSort(A);
			for (int i = 0; i < A.length - 1; i++) {
				if (i == 0) {
					if (A[i] != A[i+1]) {
						a = A[i];
					}	
				} else {
					if (A[i] != A[i+1] && A[i] != A[i-1]) {
						a = A[i];
					}
				}
			}
		}
		return a;
	}
}


/*
 * I overcomplicated this - every second check was enough and the added
 * complexity doesnt work as it should here.... this was much simpler than i
 * struggled with public int solution(int[] A) { //non empty if (A.length == 0)
 * { return 0; } if (A.length == 1) { return A[0]; } Arrays.sort(A); for (int i
 * = 0; i < A.length-2; i += 2) { if (A[i] != A[i+1]) return A[i]; } return
 * A[A.length-1]; }
 */