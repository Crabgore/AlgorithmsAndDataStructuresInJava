package lesson_7;

import java.util.LinkedList;

public class BreadthFirstPath extends FirstPath {
    public BreadthFirstPath(Graph g, int source) {
        super(g, source);
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        getMarked()[source] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!getMarked()[w]) {
                    getMarked()[w] = true;
                    getEdgeFrom()[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
