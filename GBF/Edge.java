package GBF;

public class Edge {
    Vertex v1, v2;
    int weight;
    boolean traveled = false;

    public Edge(Vertex v1, Vertex v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
        v1.edge.add(this);
        v2.edge.add(this);
        
    }
    
    public Edge() {
        
    }
    
}
