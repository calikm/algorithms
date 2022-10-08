package pckg;

public class CodilityLesson1 {
	public static void main(String[] args) {
		
		int check = 1120;
		
		String binValue = Integer.toBinaryString(check);
		
		System.out.println(binValue);
		
		solution(check);

	}
	
	public static int solution(int N) {
		
		if (N < 0) {
			throw new IllegalArgumentException();
		}
		
		String binValue = Integer.toBinaryString(N);
		
		int result = 0;
		
		String[] results = binValue.split("1");
		
		for (String zeroes : results) {
			System.out.println(zeroes);
		}
		
		int max = results.length;
		if (binValue.charAt(binValue.length() - 1) == '0') {
			max = results.length -1;
		}
		
		for (int i = 0; i < max; i++) {
				String piece = results[i];
				if (result < piece.length()) {
					result = piece.length();
				}
		}
		
		System.out.println(result);
		return result;
	}

}
