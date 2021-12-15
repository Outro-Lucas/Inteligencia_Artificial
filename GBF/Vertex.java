package GBF;

import java.util.ArrayList;

public class Vertex {
    String name;
    int heu;
    boolean visited = false;
    ArrayList<Edge> edge = new ArrayList<>();

    public Vertex(String name, int heu) {
        this.name = name;
        this.heu = heu;
    }

    public Vertex() {
        
    }

    public ArrayList<Vertex> notVisitedAdj(){
        ArrayList<Vertex> v = new ArrayList<>();
        if (edge!=null){
            for (int i=0; i<edge.size(); i++) {
                if (edge.get(i).v1.name.equals(name) && edge.get(i).v2.visited==false) {
                    v.add(edge.get(i).v2);
                }
                else if (edge.get(i).v2.name.equals(name) && edge.get(i).v1.visited==false) {
                    v.add(edge.get(i).v1);
                }
            }
        }
        return v;
    }
}