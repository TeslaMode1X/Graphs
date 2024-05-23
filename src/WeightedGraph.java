import java.util.*;

public class WeightedGraph<V> {
    private final Map<Vertex<V>, Vertex<V>> vertices = new HashMap<>();

    public void addVertex(Vertex<V> vertex) {
        vertices.putIfAbsent(vertex, vertex);
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight) {
        if (source.equals(dest)) {
            return;
        }
        vertices.putIfAbsent(source, source);
        vertices.putIfAbsent(dest, dest);

        vertices.get(source).addAdjacentVertex(dest, weight);
    }


    public boolean hasVertex(Vertex<V> v) {
        return vertices.containsKey(v);
    }

    public List<Vertex<V>> adjacencyList(Vertex<V> v) {
        if (!hasVertex(v)) return null;

        return new ArrayList<>(v.getAdjacentVertices().keySet());
    }

    public List<Vertex<V>> getVertices() {
        return new ArrayList<>(vertices.values());
    }


    public Iterable<Vertex<V>> getEdges(Vertex<V> v) {
        if (!hasVertex(v)) return null;

        return (Iterable<Vertex<V>>) vertices.get(v);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Vertex<V> v : vertices.keySet()) {
            builder.append(v.toString()).append(" -> ");
            for (Map.Entry<Vertex<V>, Double> entry : v.getAdjacentVertices().entrySet()) {
                builder.append(entry.getKey().toString()).append(" (").append(entry.getValue()).append("), ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}