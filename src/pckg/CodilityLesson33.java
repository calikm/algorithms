package pckg;

public class CodilityLesson33 {
	public static void main(String[] args) {
		
		int[] arrayP = {1, 4, 16};
		int[] arrayQ = {26, 10, 20};
		solution(26, arrayP, arrayQ);
		
	}
	
	//this is one of those tasks that i really have to go back to
	//2 classes are created, lesson33 and lesson33100 and i do not understand how, but even after i modify most of my code to resemble
	//the 100 solution, its still slow! why? it doesnt make any sense, the only nested for is from the 100 solution the rest shouldnt cause problems
	//sieve is basically from the reading materials... i dont get it
	
	public static int[] solution(int N, int[] P, int[] Q) {
		
		int[] result = new int[P.length];
		
		if (P.length != Q.length || N < 4 || N > 50000 || P.length > 30000) {
			return result;
		}
		
		//array of ints with the limit of highestNumber, used for prime calculation
		int[] primes = new int[N/2+1];
		
		//populating the array
		for (int i = 0; i < primes.length; i++) {
			primes[i] = i;
		}
		//sieve
		for (int i = 2; i < primes.length; i++) {
			int k = i*i;
			while (k < primes.length && k > 0) {
				if (primes[k] != 0) {
					primes[k] = 0;
				}
				k += i;
			}
		}
		
		
        int[] semiPrimes = new int[N+1];
        
        for (int i = 0; i < primes.length; i++) {
        	for (int j = 0; j < primes.length; j++) {
        		if (primes[i] >= 2 && primes[j] >=2) {
        			int sPrime = primes[i] * primes[j];
        			if(sPrime <= N && sPrime >= 4) {
        				semiPrimes[sPrime] = 1;
        			}
        		}
        	}
        }


		int[] prefix = new int[semiPrimes.length];
		
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = semiPrimes[i] + prefix[i-1];
		}
		
		for (int i = 0; i < P.length; i++) {
			result[i] = prefix[Q[i]] - prefix[P[i]-1];
		}
		
		return result;
	}

}