package pckg;

import java.util.Arrays;

// this is annoying. You had to guess/understand/know that the order of the triangle pieces doesnt matter
// so instead of checking 3 conditions, sorting an array already takes care of 2 of them, and you need to check only one
// then the code is exactly the same as in the reading materials and as i tried to make work already multiple times
// again, the code was ok - the condition was missing
// anyway - brute force solution which i wrote was On3 and yielded 72 % either way, this was a 100% where you needed to understand the principle
// that sorting these elements changes nothing (and i thought it did) - people in the forums also argue this ;)

public class CodilityLesson42 {
	public static void main(String[] args) {
		
		int[] A = {10, 2, 5, 1, 8, 12};
		solution(A);
		
	}
	
	public static int solution(int[] A) {
		
		if (A.length < 3) {
			return 0;
		}
        
        Arrays.sort(A);
        
        int result = 0;
        
        for (int x=0; x < A.length; x++) {
        	
            int z = x + 2;
            for (int y=x+1; y < A.length; y++) {
            	
                while(z<A.length && A[x]+A[y]>A[z]) {
                    z++;    
                }
                result += z-y-1; 
            }
        }
        return result;
	}

}
