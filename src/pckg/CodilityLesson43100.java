package pckg;

import java.util.Arrays;

//decided to google as my result yielded 63%, this is 100%
//interestingly, people clearly cannot read code properly as there were 2 variables here that did absolutely nothing
//i removed them and its working fine

public class CodilityLesson43100 {
	public static void main(String[] args) {
		
		//{-8, 4, 5, -10, 3};
		//should be 3
		
		int[] A = {1, 4, -3};
		//should be 1
		solution(A);
		
	}
	
	public static int solution(int[] A) {
		
		// sort the array if it is unsorted
		Arrays.sort(A);
		
		int low = 0;
		int high = A.length - 1;
		
		if (A[0] >= 0) {
		   return 2 * A[0];
		}
		 if (A[high] <= 0) {
		   return -2 * A[high];
		}
		// maintain two indexes pointing to endpoints of the array


		// `min` stores the minimum absolute difference
		int min = Integer.MAX_VALUE;

		// reduce the search space `A[low…high]` at each iteration of the loop
		int sum = 0;
		// loop if `low` is less than `high`
		while (low < high) {
			
		   // update the minimum if the current absolute sum is less.   
		   sum = A[high] + A[low];
		   if (Math.abs(sum) < min) {
		       min = Math.abs(sum);
		   }

		   // optimization: pair with zero-sum is found
		   if (min == 0) {
		       break;
		   }

		   // increment `low` index if the total is less than 0 
		   // decrement `high` index if the total is more than 0
		   if (sum < 0) {
		       low++;
		   }
		   else {
		       high--;
		   }
		}
		return min;
	}
}



