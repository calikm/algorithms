package pckg;

import java.util.Stack;

//had to google

public class CodilityLesson22 {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 3, 2, 1};
		solution(array);
		
	}
	
	
	
	public static int solution(int[] H) {
		
	    Stack<Integer> s = new Stack<Integer>();
	    int count = 1;

	    for (int i = 0; i < H.length-1; i++) {
	        if (H[i + 1] > H[i]) {
	            s.push(H[i]);
	            count++;
	        } else if (H[i + 1] < H[i]) {
	            if (s.empty()) {
	                s.push(H[i]);
	                count++;
	            } else if (H[i+1] > s.peek()) {
	                count++;
	            } else if (H[i+1] < s.peek()) {
	                while (!s.empty() && H[i+1] < s.peek()) {
	                    s.pop();
	                }
	                if (s.empty()) {
	                    count++;
	                } else if (H[i+1] > s.peek()) {
	                    count++;
	                }
	            } else {
	                s.pop();
	            }
	        }
	    }
	    return count;
	}

}
