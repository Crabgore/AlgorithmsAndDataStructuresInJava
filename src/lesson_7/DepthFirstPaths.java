package lesson_7;

public class DepthFirstPaths extends FirstPath {
    public DepthFirstPaths(Graph g, int source) {
        super(g, source);
        dfs(g, source);
    }

    private void dfs(Graph g, int v) {
        getMarked()[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!getMarked()[w]) {
                getEdgeFrom()[w] = v;
                dfs(g, w);
            }
        }
    }
}
