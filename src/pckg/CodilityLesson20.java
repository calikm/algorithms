package pckg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayDeque;


//87 %
public class CodilityLesson20 {
	public static void main(String[] args) {
		
		int[] array1 = {4, 3, 2, 1, 5};
		int[] array2 = {0, 1, 0, 0, 0};
		solution(array1, array2);
	}
	
	public static int solution(int[] A, int[] B) {
		
		if (A.length == 0 || B.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return 1;
		}
		if (A.length == 2) {
			if (B[0] == 1 && B[1] == 0) {
				return 1;
			}
			else {
				return 2;
			}
		}
		
		Set<Integer> distinctA = new TreeSet<>();
		for (int number : A) {
			distinctA.add(number);
		}
		
		Set<Integer> distinctB = new HashSet<>();
		for (int number : B) {
			distinctB.add(number);
		}
		
		if (distinctA.size() == A.length && A.length == B.length && distinctB.size() <= 2 && distinctB.size() > 0) {
			
			Object[] check = distinctA.toArray();
			if ((int) check[0] < 0) {
				System.out.println("zero");
				return 0;
			}
			
			ArrayDeque<Integer> stack = new ArrayDeque<>();
			stack.push(A[0]);
			int direction = 0;
			if (B[0] != 0) {
				direction++;
			}
			
			for (int i = 1; i < A.length; i++) {
				if (B[i] == 0 && direction > 0) {
					while (A[i] > stack.peek() && direction > 0) {
						stack.poll();
						direction--;
					}
					if (direction == 0) {
						stack.push(A[i]);
					}
				} else if (B[i] == 1) {
					direction++;
					stack.push(A[i]);
				} else {
					stack.push(A[i]);
				}
			} 
			System.out.println(stack.size());
			return stack.size();
		} return 0;
	}

}
