package pckg;

//https://www.baeldung.com/java-breadth-first-search

import java.util.*;

public class BreadthFirstSearchAlgorithm {

    //private static final Logger LOGGER = LoggerFactory.getLogger(BreadthFirstSearchAlgorithm.class);

    public static <T> Optional<TreeBFS<T>> search(T value, TreeBFS<T> root) {
        Queue<TreeBFS<T>> queue = new ArrayDeque<>();
        queue.add(root);

        TreeBFS<T> currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            //LOGGER.debug("Visited node with value: {}", currentNode.getValue());

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                queue.addAll(currentNode.getChildren());
            }
        }

        return Optional.empty();
    }

    public static <T> Optional<NodeBFS<T>> search(T value, NodeBFS<T> start) {
        Queue<NodeBFS<T>> queue = new ArrayDeque<>();
        queue.add(start);

        NodeBFS<T> currentNode;
        Set<NodeBFS<T>> alreadyVisited = new HashSet<>();

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            //LOGGER.debug("Visited node with value: {}", currentNode.getValue());

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                alreadyVisited.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(alreadyVisited);
            }
        }

        return Optional.empty();
    }

}