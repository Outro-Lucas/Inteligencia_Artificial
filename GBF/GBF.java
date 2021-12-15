package GBF;

import java.util.ArrayList;

public class GBF {
    Graph g;
    
    public GBF(Graph g) {
        this.g = g;
    }
    
    public void travel(Vertex a, Vertex b) {
        int cost = 0;
        Vertex pos = a;
        ArrayList<Vertex> toTravel = a.notVisitedAdj();
        String expand = a.name;
        int minHeu = Integer.MAX_VALUE;
        Vertex choosen = new Vertex();
        Edge e1 = new Edge();
        Edge e2 = new Edge();
        
        a.visited = true;
        
        while (pos!=b) {
            if (toTravel!=null){
                for (int i=0; i<toTravel.size(); i++) {
                    if (minHeu > toTravel.get(i).heu) {
                        minHeu = toTravel.get(i).heu;
                        choosen = toTravel.get(i);
                    } else if (minHeu == toTravel.get(i).heu) {
                        e1 = g.getEdge(pos, choosen);
                        e2 = g.getEdge(pos, toTravel.get(i));
                        if (e1.weight>=e2.weight) {
                            minHeu = toTravel.get(i).heu;
                            choosen = toTravel.get(i);
                        }
                    }
                }
            }
            
            expand += (" -> " + choosen.name);
            if (toTravel!=null) {
                toTravel.remove(choosen);
            }
            //toTravel += choosen.notVisitedAdj();
            if (toTravel!=null) {
                for (int i=0; i<choosen.notVisitedAdj().size(); i++) {
                    toTravel.add(choosen.notVisitedAdj().get(i));
                }
            }
            choosen.visited = true;
            if (g!=null && g.getEdge(pos,choosen)!=null) {
                cost += g.getEdge(pos,choosen).weight;
            }
            pos = choosen;
            minHeu = Integer.MAX_VALUE;
        }
        
        System.out.println("From " + a.name + " to " + b.name);
        System.out.println("Path : " + expand);
        System.out.println("Cost : " + cost);
    }
    
}
