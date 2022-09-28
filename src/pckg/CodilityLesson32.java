package pckg;

//googled it, as my solution yielded 55% - 100 correctness, but low performance due to using O(n^2) complexity
//its difficult for me to understand how come a nested for loop is slower than a nested 'while' in for loop

public class CodilityLesson32 {
	public static void main(String[] args) {
		
		int[] array = {3, 1, 2, 3, 6};
		solution(array);
	}
	

	
	public static int[] solution(int[] A) {
		
		//find max number. To be used for 'count sort' array size.
	    int max = A[0];
	    for (int i = 1 ; i < A.length ; i++) {
	        max = Math.max(max, A[i]);
	    }

	    //count sort
	    int [] count = new int [max+1];
	    for (int i = 0 ; i < A.length ; i++) {
	        count[A[i]]++;
	    }

	    int [] nonDiv = new int [max+1];
	    //initially count all elements as non divisible (minus 'number of occurrences' of the the given number)
	    for (int i = 1 ; i < nonDiv.length; i++) {
	        if (count[i] != 0) {//skip numbers which don't exists in table A
	            nonDiv[i] = A.length - count[i];
	        }
	    }

	    //sieve
	    for (int i = 1 ; i < nonDiv.length; i++) {
	        if (count[i] != 0) {//skip numbers which don't exists in table A
	            int s = i*2;
	            while (s<nonDiv.length) {
	                if (nonDiv[s] != 0) {
	                    //Sieve. Most important part. Decrease number of non-divisible by the number of occurrences of number 'i'.
	                    nonDiv[s] -= count[i];
	                }
	                s+=i;
	            }
	        }
	    }

	    //produce the output
	    int []res = new int [A.length];
	    for (int i = 0 ; i < A.length ; i++) {
	        res[i] = nonDiv[A[i]];
	    }

	    return res;
		
		
		/*
		 * int[] array = new int[A.length];
		 * 
		 * if (A.length == 0) { return array; } if (A.length == 1) { array[0] = 1; }
		 * 
		 * 
		 * 
		 * 
		 * int nDiv = 0;
		 * 
		 * for (int i = 0; i < A.length; i++) { if (A[i] < 1 || A[i] > A.length*2) {
		 * array = new int[A.length]; return array; } for (int j = 0; j < A.length; j++)
		 * { if (A[i] % A[j] != 0) { nDiv++; } } array[i] = nDiv; nDiv = 0;
		 * 
		 * } for (int num : array) { System.out.printf("%d ", num); } return array;
		 */
	}
}



