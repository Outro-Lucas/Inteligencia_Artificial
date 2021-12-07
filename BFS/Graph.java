package BFS;
import java.util.*; 
public class Graph 
{ 
    class Edge{
		int vertex,weight;
               
		public Edge(int v,int w){
			this.vertex=v; this.weight=w;
		}
		@Override
		public String toString(){
			return "("+vertex+","+weight+")";
		}
	}
    public int V;   // Quantidade de vertices 
    public LinkedList<Edge> adj[]; //Listas de Adjacências 
  
    @SuppressWarnings({ "unchecked", "rawtypes" })
	Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
   
    void addEdge(int v,int dest,int weight) 
    { 
        Edge e=new Edge(dest,weight);
        adj[v].add(e);
    } 
  @Override
	public String toString(){
		String result="";
               
		for(int i=0;i<adj.length;i++)
                       
			result+=i+"=>"+adj[i]+"\n";
		return result;
	}
  void BFS(int s,int goal) 
  { 
      
      boolean visited[] = new boolean[V]; 

      LinkedList<Integer> queue = new LinkedList<Integer>(); 
      LinkedList<Integer> queue1 = new LinkedList<Integer>(); 
      queue1.addLast(0);
      visited[s]=true; 
      queue.add(s); 
      int cost=0,c=0;
      while (queue.size() != 0) 
      { 
          s = queue.poll(); 
          c= queue1.poll();
          System.out.print(s+" "); 
          cost+=c;
          if(s==goal)break;
         
          Iterator<Edge> i = adj[s].listIterator(); 
          int n;
          
          while (i.hasNext()) 
          { 
              Edge e = i.next();
              n=e.vertex;
              
              if (!visited[n]) 
              { 
                  visited[n] = true; 
                  queue.add(n);
                  queue1.add(e.weight);
              } 
              
          } 
          
      } 
      System.out.println("\nPath cost: "+cost);
  }
}