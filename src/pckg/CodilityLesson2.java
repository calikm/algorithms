package pckg;

public class CodilityLesson2 {
	public static void main(String[] args) {
		
		int[] array = {4, 2, 5, 1, 8};
		
		int[] turnedArray = solution(array, 6);
		
		for (int number : turnedArray) {
			System.out.printf("%d, ", number);
		}
		
	}
	
    public static int[] solution(int[] A, int K) {
    	
    	boolean check = false;
    	
    	for (int number : A) {
    		if (number < -1000 || number > 1000) {
    			check = true;
    		}
    	}
    	
    	
    	if (K > 0 && K <= 100 && A.length > 0 && A.length <= 100 && check == false) {
    		
    		int[] result = A.clone();
    		
    		for (int i = 0; i < K; i++) {
    			result[0] = A[A.length - 1];
    			for (int j = 1; j < A.length; j++) {
    				result[j] = A[j - 1];
    			}
    			A = result.clone();
    		}
    		return result;
     	} else {
     		return A;
     	}
    }

}
