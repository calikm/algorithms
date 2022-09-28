package pckg;

//https://www.baeldung.com/java-breadth-first-search

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class TreeBFS<T> {
	    private T value;
	    private List<TreeBFS<T>> children;

	    private TreeBFS(T value) {
	        this.value = value;
	        this.children = new ArrayList<>();
	    }

	    public static <T> TreeBFS<T> of(T value) {
	        return new TreeBFS<>(value);
	    }

	    public TreeBFS<T> addChild(T value) {
	    	TreeBFS<T> newChild = new TreeBFS<>(value);
	        children.add(newChild);
	        return newChild;
	    }
	    public T getValue() {
	        return value;
	    }

	    public List<TreeBFS<T>> getChildren() {
	        return Collections.unmodifiableList(children);
	    }
	    
	public static <T> Optional<TreeBFS<T>> search(T value, TreeBFS<T> root) {
	    
		Queue<TreeBFS<T>> queue = new ArrayDeque<>();
	    queue.add(root);
	    
	    while(!queue.isEmpty()) {
	    	TreeBFS<T> currentNode = queue.remove();
	    		if (currentNode.getValue().equals(value)) {
		    	    return Optional.of(currentNode);
		    	} else {
		    	    queue.addAll(currentNode.getChildren());
		    	}
	    	}
	    	
	    return Optional.empty();
	}
}
