package lesson_7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        BreadthFirstPath bfp;

        graph.addEdge(0, 4);
        graph.addEdge(0, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 7);
        graph.addEdge(7, 9);
        graph.addEdge(9, 6);
        graph.addEdge(6, 3);
        graph.addEdge(6, 2);
        graph.addEdge(6, 8);
        graph.addEdge(3, 1);
        graph.addEdge(2, 8);

        bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.pathInfo(1));

        bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.pathInfo(3));

        bfp = new BreadthFirstPath(graph, 5);
        System.out.println(bfp.pathInfo(2));
    }
}
