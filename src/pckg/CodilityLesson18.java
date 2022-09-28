package pckg;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

//had to google that one

public class CodilityLesson18 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 1, 4, 0};
		solution(array);
		
	}
	
	
	public static int solution(int[] A) {
		
		int overlaps = 0;
	    if (A.length<2) { 
	    	return 0;
	    }
	    PriorityQueue<Integer> leftEdges = new PriorityQueue<Integer>();
	    PriorityQueue<Long> rightEdges = new PriorityQueue<Long>();
	    for (int i=0; i<A.length; i++){
	      leftEdges.add(i-A[i]);
	      rightEdges.add((long)i+(long)(A[i]));
	    }
	    int otherCirclesAtThisEdgeNum = 0;
	    while ( !rightEdges.isEmpty()) {
	      try {
	        if (leftEdges.element() <= rightEdges.peek() ) {
	          overlaps += otherCirclesAtThisEdgeNum++;
	          if (overlaps > 10000000) return -1;
	          leftEdges.poll();
	        } else {
	          otherCirclesAtThisEdgeNum--;
	          rightEdges.poll();
	        }
	      }catch (NoSuchElementException e){
	        break;
	      }
	    }
	    return overlaps;
	}

}
