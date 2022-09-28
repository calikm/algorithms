package pckg;

public class CodilityLesson27 {
	public static void main(String[] args) {
		
		int[] array = {3, 2, 6, -1, 4, 5, -1, 2};
		solution(array);
		
	}
	
	//had to google, although it was close... i used the same techniques i just failed to see the relationship between left sums and right sums
	//also something about kadanes algorithm - read up on it
	
	public static int solution(int[] A) {
		
        int[] maxStartingHere = new int[A.length];
        int[] maxEndingHere = new int[A.length];
        int maxSum = 0;
        int len = A.length;

        for(int i = len - 2; i > 0; --i ) {            
            maxSum = Math.max(0, A[i] + maxSum);
            maxStartingHere[i] = maxSum;
        }
        
        maxSum = 0;
        
        for(int i = 1; i < len - 1; ++i ) {            
            maxSum = Math.max(0, A[i] + maxSum);
            maxEndingHere[i] = maxSum;
        }
        
        int maxDoubleSlice = 0;

        for(int i = 0; i < len - 2; ++i) {
            maxDoubleSlice = Math.max(maxDoubleSlice, maxEndingHere[i] + maxStartingHere[i+2]);
        }
        
        System.out.println(maxDoubleSlice);
        return maxDoubleSlice;
	}
}
