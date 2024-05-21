
public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> v1 = new Vertex<>("A");
        Vertex<String> v2 = new Vertex<>("B");
        Vertex<String> v3 = new Vertex<>("C");
        Vertex<String> v4 = new Vertex<>("D");
        Vertex<String> v5 = new Vertex<>("E");
        Vertex<String> v6 = new Vertex<>("F");
        Vertex<String> v7 = new Vertex<>("G");

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);
        graph.addVertex(v7);

        graph.addEdge(v1, v2, 1.0);
        graph.addEdge(v1, v3, 2.0);
        graph.addEdge(v1, v4, 3.0);
        graph.addEdge(v1, v5, 4.0);
        graph.addEdge(v1, v6, 5.0);
        graph.addEdge(v1, v7, 6.0);

        graph.addEdge(v2, v3, 2.0);
        graph.addEdge(v3, v4, 3.0);
        graph.addEdge(v4, v5, 4.0);
        graph.addEdge(v5, v6, 5.0);
        graph.addEdge(v6, v7, 6.0);

        System.out.println(graph);
    }
}
