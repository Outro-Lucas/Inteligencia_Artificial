package AST;

public class Main {
    public static void main(String args[]) 
    { 
    	String[] cities= {"Arad","Timisioara","Sibiu","Zerind","Lugoj",
    			"Rimnicu Vilcea","Fagarus","Oradea","Mehadia","Craiova"
    			,"Pitesti","Bucharest","Drobeta","Giurgiu","Urziceni"
    			,"Hirsova","Eforie","Vaslui","Iasi","Neamt"};
        Graph RomaniaMap = new Graph(20,cities); 
        
        /*
        0= Arad, 1=Timisioara, 2=Sibiu, 3=Zerind, 4=Lugoj
        5=Rimnicu Vilcea, 6=Fagarus, 7=Oradea, 8=Mehadia
        9=Craiova, 10=Pitesti, 11=Bucharest, 12=Drobeta
        13=Giurgiu, 14=Urziceni, 15=Hirsova, 16=Eforie
        17=Vaslui, 18=Iasi, 19=Neamt
         */
        //Arad-->Timisoara				Arad-->Sibiu
        RomaniaMap.addEdge(0, 1, 118); RomaniaMap.addEdge(0, 2, 140);
      //Arad-->Zerind
        RomaniaMap.addEdge(0, 3, 75); 
        
        //Timisoara-->Arad				Timisoara-->Lugoj
        RomaniaMap.addEdge(1, 0, 118); RomaniaMap.addEdge(1, 4, 111);
        
        //Sibiu-->Arad					Sibiu-->Rimnicu Vilcea
        RomaniaMap.addEdge(2, 0, 140); RomaniaMap.addEdge(2, 5, 80);
        //Sibiu-->Fagaras				Sibiu-->Oradea
        RomaniaMap.addEdge(2, 6, 99);  RomaniaMap.addEdge(2, 7, 151);
        
        //Zerind-->Arrad				Zerind-->Oradea
        RomaniaMap.addEdge(3, 0, 75); RomaniaMap.addEdge(3, 7, 71);
        
        //Lugoj-->Timisoara				Lugoj-->Mehadia
        RomaniaMap.addEdge(4, 1, 111); RomaniaMap.addEdge(4, 8, 70);
        
        //Rimnicu Vilcea-->Sibiu		Rimnicu Vilcea-->Craiova
        RomaniaMap.addEdge(5, 2, 80); RomaniaMap.addEdge(5, 9, 146);
        //Rimnicu Vilcea-->Pitesti
        RomaniaMap.addEdge(5, 10, 97);
        
        //Fagaras-->Sibiu				Fagaras-->Bucharest
        RomaniaMap.addEdge(6, 2, 99); RomaniaMap.addEdge(6, 11, 211);
        
        //Oradea-->Zerind				Oradea-->Sibiu
        RomaniaMap.addEdge(7, 3, 71); RomaniaMap.addEdge(7, 2, 151);
        
        //Mehadia-->Lugoj				Mehadia-->Drobeta
        RomaniaMap.addEdge(8, 4, 70); RomaniaMap.addEdge(8, 12, 75);
        
        //Craiova-->Drobeta				Craiova-->Pitesti
        RomaniaMap.addEdge(9, 12, 120); RomaniaMap.addEdge(9, 10, 138);
        //Craiova-->Rimnicu Vilcea
        RomaniaMap.addEdge(9, 5, 146);
        
        //Pitesti-->Craiova				Pitesti-->Bucharest
        RomaniaMap.addEdge(10, 9, 138); RomaniaMap.addEdge(10, 11, 101);
        //Pitesti-->Rimnicu Vilcea
        RomaniaMap.addEdge(10, 5, 97);
        
        //Bucharest-->Pitesti			Bucharest-->Fagaras
        RomaniaMap.addEdge(11, 10, 101); RomaniaMap.addEdge(11, 6, 211);
        //Bucharest-->Giurgiu			Bucharest-->Urzeceni
        RomaniaMap.addEdge(11, 13, 90); RomaniaMap.addEdge(11, 14, 85);
     
        //Drobeta-->Mehadia				Drobeta-->Craiova
        RomaniaMap.addEdge(12, 8, 75); RomaniaMap.addEdge(12, 9, 120);
        
        //Giurgiu-->Bucharest
        RomaniaMap.addEdge(13, 11, 90);
        
        //Urzeceni-->Bucharest			Urzeceni-->Hirsova
        RomaniaMap.addEdge(14, 11, 85); RomaniaMap.addEdge(14, 15, 98);
        //Urzeceni-->Vaslui
        RomaniaMap.addEdge(14, 17, 142);
        
        //Hirsova-->Urzeceni			Hirsova-->Eforie
        RomaniaMap.addEdge(15, 14, 98); RomaniaMap.addEdge(15, 16, 86);
        
        //Eforie-->Hirsova
        RomaniaMap.addEdge(16, 15, 86);
        
        //Vaslui-->Urzeceni				Vaslui-->Iasi
        RomaniaMap.addEdge(17, 14, 142); RomaniaMap.addEdge(17, 18, 92);
        
        //Iasi-->Vaslui					Iasi-->Neamt
        RomaniaMap.addEdge(18, 17, 92); RomaniaMap.addEdge(18, 19, 87);
        
        //Neamt-->Iasi
        RomaniaMap.addEdge(19, 18, 87);
       
        int from=0, to=11;
        System.out.println("A seguir está o Largura Primeiro Traversal "+ 
                           "\n(começando do vértice "+from+" ("+cities[from]+")"
                           		+ " para alcançar o vértice "+to+" ("+cities[to]+")"); 
  
        RomaniaMap.AST(from,to);
        
    }

}
