package pckg;

import java.util.ArrayList;

public class CodilityLesson29 {
	public static void main(String[] args) {
		
		solution(30);
		
	}
	
	public static int solution(int N) {
		
		if (N < 1) {
			return 0;
		}
		if (N == 1) {
			return 4;
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 1; i <= N/2; i++) {
			if (N % i == 0) {
				arrayList.add(i);
				arrayList.add(N/i);
				if (N / i < i) {
					break;
				}
			}
		}
		
		int min = 2 * (arrayList.get(0) + arrayList.get(1));
		
		for (int i = 2; i < arrayList.size() - 2; i+= 2) {
			if (min > 2 * (arrayList.get(i) + arrayList.get(i+1))) {
				min = 2 * (arrayList.get(i) + arrayList.get(i+1));
			}
		}
		return min;
	}
}
