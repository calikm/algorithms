package pckg;

//https://www.baeldung.com/java-breadth-first-search

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NodeBFS<T> {
	    private T value;
	    private Set<NodeBFS<T>> neighbors;

	    public NodeBFS(T value) {
	        this.value = value;
	        this.neighbors = new HashSet<>();
	    }

	    public T getValue() {
	        return value;
	    }

	    public Set<NodeBFS<T>> getNeighbors() {
	        return Collections.unmodifiableSet(neighbors);
	    }

	    public void connect(NodeBFS<T> node) {
	        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
	        this.neighbors.add(node);
	        node.neighbors.add(this);
	    }

}

