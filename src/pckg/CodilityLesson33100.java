package pckg;

import java.util.ArrayList;
import java.util.List;

//googled solution... somehow despite nested fors its faster... it doesnt make sense to me whatsoever

public class CodilityLesson33100 {
	public static void main(String[] args) {
		
		int[] arrayP = {1, 4, 16};
		int[] arrayQ = {26, 10, 20};
		solution(26, arrayP, arrayQ);
		
	}
	
    public static int[] solution(int N, int[] P, int[] Q) {
    	
        Integer[] primes = sieve(N/2+1);

        for (int num : primes) {
        	System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.println();
        
        int[] temp = new int[N+1];

        for (int i = 0; i < primes.length; i++) {
        	for (int j = 0; j < primes.length; j++) {
        		int semiPrime = primes[i] * primes[j];
        			if(semiPrime <= N) {
        				temp[semiPrime] = 1;
        			}
        	}
        }
        
        for (int num : temp) {
        	System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.println();

        int[] prefix = new int[N+1];
        
        for (int i = 1; i < temp.length; i++) {
        	prefix[i] = temp[i] + prefix[i-1];
        }
        
        for (int num : prefix) {
        	System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.println();

        int[] retVal = new int[P.length];
        
        for (int i = 0; i < retVal.length; i++) {
        	retVal[i] = prefix[Q[i]] - prefix[P[i]-1];
        }

        for (int num : retVal) {
        	System.out.printf("%d ", num);
        }
        return retVal; 
    }


    public static Integer[] sieve(int n) {

    boolean[] temp = new boolean[n+1];

    for (int i = 0; i < temp.length; i++) {
    	temp[i] = true;
    }
    temp[0] = temp[1] = false;

    int i = 2;
    while (i * i <= n) {
    	removeProducts( temp, i );
    	i++;
    }

    List<Integer> ret = new ArrayList<>();
    
    for (int j = 0; j < temp.length; j++) {
    	if(temp[j] == true) {
    		ret.add( j );
    	}
    }

    return ret.toArray( new Integer[ret.size()] );
}

    private static void removeProducts(boolean[] temp, int i) {
    	
    	for (int j = i*i; j < temp.length; j++) {
    		if(temp[j] && j % i == 0) {
    			temp[j] = false;
    		}
    	}
    }
}
