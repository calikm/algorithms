package pckg;

public class CodilityLesson4 {
	public static void main(String[] args) {
		
		solution(1, 100, 7);
		
		
	}
	
	public static int solution(int X, int Y, int D) {
		
		if (X < Y && X >= 1 && Y >= 1) {
			int result = (Y - X) / D;
			if ((Y - X) % D > 0) {
				result++;
			}
			return result;
		} else {
			return 0;
		}
		
	}

}
