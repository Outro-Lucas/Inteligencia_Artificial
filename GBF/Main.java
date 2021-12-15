package GBF;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<Vertex> v = new ArrayList<>();
        ArrayList<Edge> e = new ArrayList<>();
        buildGraph(v, e, graph);
        
        GBF gbf = new GBF(graph);
        gbf.travel(graph.vertex.get(0), graph.vertex.get(1));
        
    }
    
    public static void buildGraph(ArrayList<Vertex> v, ArrayList<Edge> e, Graph graph) {
        v.add(new Vertex("Arad", 366));             //0
        v.add(new Vertex("Bucharest", 0));          //1
        v.add(new Vertex("Craiova", 160));          //2
        v.add(new Vertex("Dobreta", 242));          //3
        v.add(new Vertex("Eforie", 161));           //4
        v.add(new Vertex("Fagaras", 178));          //5
        v.add(new Vertex("Giurgiu", 77));           //6
        v.add(new Vertex("Hirsova", 151));          //7
        v.add(new Vertex("Iasi", 226));             //8
        v.add(new Vertex("Lugoj", 244));            //9
        v.add(new Vertex("Mehadia", 241));          //10
        v.add(new Vertex("Neamt", 234));            //11
        v.add(new Vertex("Oradea", 380));           //12
        v.add(new Vertex("Pitesti", 98));           //13
        v.add(new Vertex("Rimnicu Vilcea", 193));   //14
        v.add(new Vertex("Sibiu", 253));            //15
        v.add(new Vertex("Timisoara", 329));        //16
        v.add(new Vertex("Urziceni", 80));          //17
        v.add(new Vertex("Vaslui", 199));           //18
        v.add(new Vertex("Zerind", 374));           //19

        e.add(new Edge(v.get(0), v.get(15),140));   //Arad-Sibiu
        e.add(new Edge(v.get(0), v.get(16), 118));  //Arad-Timisoara
        e.add(new Edge(v.get(0), v.get(19), 75));   //Arad-Zerind
        e.add(new Edge(v.get(1), v.get(5), 211));   //Bucharest-Fagaras
        e.add(new Edge(v.get(1), v.get(6), 90));    //Bucharest-Giurgiu
        e.add(new Edge(v.get(1), v.get(13), 101));  //Bucharest-Pitesti
        e.add(new Edge(v.get(1), v.get(17), 85));   //Bucharest-Urziceni
        e.add(new Edge(v.get(2), v.get(3), 120));   //Craiova-Dobreta
        e.add(new Edge(v.get(2), v.get(13), 138));  //Craiova-Pitesti
        e.add(new Edge(v.get(2), v.get(14), 146));   //Craiova-Rimnicu Vilcea
        e.add(new Edge(v.get(3), v.get(10), 75));   //Dobreta-Mehadia
        e.add(new Edge(v.get(4), v.get(7), 86));    //Eforie-Hirsova
        e.add(new Edge(v.get(5), v.get(15), 99));   //Fagaras-Sibiu
        e.add(new Edge(v.get(7), v.get(17), 98));   //Hirsova-Urziceni
        e.add(new Edge(v.get(8), v.get(11), 87));   //Iasi-Neamt
        e.add(new Edge(v.get(8), v.get(18), 92));   //Iasi-Vaslui
        e.add(new Edge(v.get(9), v.get(10), 70));   //Lugoj-Mehadia
        e.add(new Edge(v.get(9), v.get(16), 111));  //Lugoj-Timisoara
        e.add(new Edge(v.get(12), v.get(15), 151)); //Oradea-Sibiu
        e.add(new Edge(v.get(12), v.get(19), 71));  //Oradea-Zerind
        e.add(new Edge(v.get(13), v.get(14), 97));  //Pitesti-Rimnicu Vilcea
        e.add(new Edge(v.get(14), v.get(15), 80));  //Rimnicu Vilcea-Sibiu
        e.add(new Edge(v.get(17), v.get(18), 142)); //Urziceni-Vaslui

        graph.setGraph(v,e);
    }
    
}
