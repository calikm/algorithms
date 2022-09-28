package pckg;

public class CodilityLesson28 {
	public static void main(String[] args) {
		
		solution(24);
		
	}
	//92%
	public static int solution(int N) {
		
		if (N < 1) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		
		int d = 1;
		int result = 0;
		
		while (d * d < N) {
			if (N % d == 0) {
				result += 2;
			}
			d += 1;
			if (d * d == N) {
				result += 1;
			}
		}
		return result;
	}

}