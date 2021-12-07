package BFS;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph RomaniaMap = new Graph(20); 
        //0= Arad
        //1=Timisioara
        //2=Sibiu
        //3=Zerind
        //4=Lugoj
        //5=Riminucu Vilcea
        //6=Fagarus
        //7=Oradea
        //8=Mehadia
        //9=Craiova
        //10=Pitesti
        //11=Bucharest
        //12=Dr obdeta
        //13=Giurgia
        //14=Ur zieemi
        //15=Hirsova
        //16=Eforie
        //17=Vasiui
        //18=Iasi
        //19=Neamut
        RomaniaMap.addEdge(0, 1, 118);
        RomaniaMap.addEdge(0, 2, 140);
        RomaniaMap.addEdge(0, 3, 75);
        RomaniaMap.addEdge(1, 0, 118);
        RomaniaMap.addEdge(1, 4, 111);
        RomaniaMap.addEdge(2, 0, 140);
        RomaniaMap.addEdge(2, 5, 80);
        RomaniaMap.addEdge(2, 6, 99);
        RomaniaMap.addEdge(2, 7, 151);
        RomaniaMap.addEdge(3, 0, 75);
        RomaniaMap.addEdge(3, 7, 71);
        RomaniaMap.addEdge(4, 1, 111);
        RomaniaMap.addEdge(4, 8, 70);
        RomaniaMap.addEdge(5, 2, 80);
        RomaniaMap.addEdge(5, 9, 146);
        RomaniaMap.addEdge(5, 10, 97);
        RomaniaMap.addEdge(6, 2, 99);
        RomaniaMap.addEdge(6, 11, 211);
        RomaniaMap.addEdge(7, 3, 71);
        RomaniaMap.addEdge(7, 2, 151);
        RomaniaMap.addEdge(8, 4, 70);
        RomaniaMap.addEdge(8, 12, 75);
        RomaniaMap.addEdge(9, 12, 120);
        RomaniaMap.addEdge(9, 10, 138);
        RomaniaMap.addEdge(9, 5, 146);
        RomaniaMap.addEdge(10, 9, 138);
        RomaniaMap.addEdge(10, 11, 101);
        RomaniaMap.addEdge(10, 5, 97);
        RomaniaMap.addEdge(11, 10, 101);
        RomaniaMap.addEdge(11, 6, 211);
        RomaniaMap.addEdge(11, 13, 90);
        RomaniaMap.addEdge(11, 14, 85);
        RomaniaMap.addEdge(12, 8, 75);
        RomaniaMap.addEdge(12, 9, 120);
        RomaniaMap.addEdge(13, 11, 90);
        RomaniaMap.addEdge(14, 11, 85);
        RomaniaMap.addEdge(14, 15, 98);
        RomaniaMap.addEdge(14, 17, 142);
        RomaniaMap.addEdge(15, 14, 98);
        RomaniaMap.addEdge(15, 16, 86);
        RomaniaMap.addEdge(16, 15, 86);
        RomaniaMap.addEdge(17, 14, 142);
        RomaniaMap.addEdge(17, 18, 92);
        RomaniaMap.addEdge(18, 17, 92);
        RomaniaMap.addEdge(18, 19, 87);
        RomaniaMap.addEdge(19, 18, 87);
       
        System.out.println("LISTA DE ADJACÊNCIA DO MAPA DA ROMÊNIA:\n"+RomaniaMap);

        System.out.println("");
        System.out.println("A seguir está o Largura Primeiro Traversal "+ 
                           "\n(começando do vértice 0 (Arad) para alcançar a meta, ou seja, vértice 11 (Bucareste)"); 
  
        RomaniaMap.BFS(0,11);
	}
}