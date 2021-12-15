package GBF;

import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertex;
    ArrayList<Edge> edge;

    public Graph() {

    }

    public void setGraph(ArrayList<Vertex> vertex, ArrayList<Edge> edge) {
        this.vertex = vertex;
        this.edge = edge;
    }
    
    public Edge getEdge(Vertex v1, Vertex v2) {
        Edge e = null;
        int i=0;
        
        while (i<edge.size()) {
            if (edge.get(i).v1 == v1 && edge.get(i).v2 == v2) {
                e = edge.get(i);
                break;
            }
            else if (edge.get(i).v2 == v1 && edge.get(i).v1 == v2) {
                e = edge.get(i);
                break;
            }
            i++;
        }
        
        return e;
    }
}
