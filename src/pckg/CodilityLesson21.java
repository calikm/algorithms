package pckg;

import java.util.ArrayDeque;

//100%
public class CodilityLesson21 {
	public static void main(String[] args) {
		
		solution("()))");
		
	}
	
	public static int solution(String S) {
		
		if (S.isEmpty()) {
			return 1;
		}
		if (S.length() % 2 == 1 || S.length() > 1000000 || S.charAt(0) == ')' || S.charAt(S.length() - 1) == '(') {
			return 0;
		}
		
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				stack.push('(');
			} else {
				if (!stack.isEmpty() && stack.contains('(')) {
					stack.poll();
				} else {
					stack.push(')');
				}
			}
		}
		System.out.println(stack.size());
		if (stack.isEmpty()) {
			return 1;
		}
		return 0;
	}

}
