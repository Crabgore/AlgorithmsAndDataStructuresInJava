package lesson_7;

import java.util.LinkedList;

public class FirstPath {
    private boolean[] marked;
    private int[] edgeFrom;
    private int source;
    private LinkedList<Integer> stack = new LinkedList<>();

    public FirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeFrom = new int[g.getVertexCount()];
    }

    public boolean[] getMarked() {
        return marked;
    }

    public int[] getEdgeFrom() {
        return edgeFrom;
    }

    private boolean hasPathTo(int dist) {
        return marked[dist];
    }

    private LinkedList<Integer> path(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        int vertex = dist;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeFrom[vertex];
        }
        return stack;
    }

    public String pathInfo (int dist) {
        String wayLength = "Длина пути: ";
        String way = "Кратчайший путь: ";
        String isWayExists = "Существует ли путь: ";
        return isWayExists + hasPathTo(dist) + "\n" + way + path(dist) + "\n" + wayLength + stack.size() + "\n";
    }
}
