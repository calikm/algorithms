package pckg;

//had to google it totally.... how people come up with this is beyond me

public class CodilityLesson38 {
	public static void main(String[] args) {
		
		int[] array = {2,1,5,1,2,2,2};
		solution(3,5,array);
	}
	
	public static int solution(int K, int M, int[] A) {
		
	    int high = sum(A); //15
	    int low = max(A); //5
	    int mid = 0;

	    int smallestSum = 0;

	    while (high >= low) {
	        mid = (high + low) / 2; // starts with 10

	        int numberOfBlock = blockCount(mid, A);

	        if (numberOfBlock > K) {
	            low = mid + 1;
	        } else if (numberOfBlock <= K) {
	            smallestSum = mid;
	            high = mid - 1;
	        }

	    }
	    return smallestSum;
	}

	public static int sum(int[] A) {
		
	    int total = 0;
	    for (int i = 0; i < A.length; i++) {
	        total += A[i];
	    }
	    return total;
	}

	public static int max(int[] A) {
		
	    int max = 0;
	    for (int i = 0; i < A.length; i++) {
	        if (max < A[i]) max = A[i];
	    }
	    return max;
	}

	public static int blockCount(int max, int[] A) {
		
	    int current = 0;
	    int count = 1;
	    for (int i = 0; i< A.length; i++) {
	        if (current + A[i] > max) {
	            current = A[i];
	            count++;
	        } else {
	            current += A[i];
	        }
	    }
	    return count;
	}
}
