package pckg;

public class CodilityLesson1 {
	public static void main(String[] args) {
		
		int check = 1041;
		
		String binValue = Integer.toBinaryString(check);
		
		System.out.println(binValue);
		
		solution(check);

	}
	
	public static int solution(int N) {
		
		String binValue = Integer.toBinaryString(N);
		
		int result = 0;
		
		String[] results = binValue.split("1");
		
		if (binValue.charAt(binValue.length() - 1) == '0') {
			for (int i = 0; i < results.length - 1; i++) {
				String piece = results[i];
				if (result < piece.length()) {
					result = piece.length();
				}
			}
		} else {
			for (int i = 0; i < results.length; i++) {
				String piece = results[i];
				if (result < piece.length()) {
					result = piece.length();
				}
			}
		}
		return result;
	}

}
