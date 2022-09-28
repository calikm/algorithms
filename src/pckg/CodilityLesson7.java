package pckg;

public class CodilityLesson7 {
	public static void main(String[] args) {
		
		int[] array = {1, 3, 1, 4, 2, 3, 5, 4};
		solution(5, array);
		
		
	}
	
    public static int solution(int X, int[] A) {
    	
    	//counts the time when a specific number between 1 and X have appeared
    	//so if you have 1,2,1,3 - it will add 1, 2, it will skip the next 1 because it has been already added, then it will add 3
    	//once a full path - 1, 2, 3, 4, 5 is made, where X is 5 then and only then the solution will return the index of the proper value
    	 int[]counter = new int[X+1];
    	    int ans = -1;
    	    int x = 0;

    	    for (int i=0; i<A.length; i++){
    	        if (counter[A[i]] == 0){
    	            counter[A[i]] = A[i];
    	            x += 1;
    	            if (x == X){
    	                return i;
    	            }
    	        } 
    	    }

    	    return ans;
    }

}

