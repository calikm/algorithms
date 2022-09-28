package pckg;

public class CodilityLesson34 {
	public static void main(String[] args) {
		
		solution(947853, 4453);
	}
	
	public static int solution(int N, int M) {
		
		if (N < 1 || M < 1) {
			return 0;
		}
		
		if (N == 1) {
			return 1;
		}
		
		if (N % M == 0) {
			return N / M;
		}
		
		if (gcd(N, M) == 1) {
			return N;
		}
		return N /gcd(N, M);
	}
	
	public static int gcd(int A, int B) {
		if (A % B == 0) {
			return B;
		} else {
			
			return gcd(B, A % B);
		}
	}

}
