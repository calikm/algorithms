package pckg;

public class CodilityLesson12 {
	public static void main(String[] args) {
		
		solution(0, 4, 2);
		
	}
	
	public static int solution(int A, int B, int K) {
		
		int result = 0;
		
		if (A == 0 && B == 0) {
			return 1;
		}
		if (A >= 0 && A <= B && K > 0 && K <= B) {
			result = B / K;
			if (A / K > 0) {
				result -= A / K;
			}
			if (A % K == 0) {
				result++;
			}

		}
		System.out.println(result);
		return result;
		
	}

}
