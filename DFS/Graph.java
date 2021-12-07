package DFS;
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
  void DFS(int s,int goal) 
      { 
         
          Vector<Boolean> visited = new Vector<Boolean>(V); 
          for (int i = 0; i < V; i++) 
              visited.add(false); 
                Stack<Integer> stack = new Stack<>(); 
           Stack<Integer> stack1 = new Stack<>();   
          
          stack.push(s);
          stack1.push(0);
          int cost=0,c; 
          while(stack.empty() == false) 
          { 
              s = stack.peek();
              c= stack1.peek();
              stack.pop(); 
              stack1.pop();
              cost+=c;
              
              if(visited.get(s) == false) 
              { 
                  System.out.print(s + " "); 
                  visited.set(s, true); 
              } 
              if(s==goal)break; 
              
              Iterator<Edge> iterator = adj[s].iterator(); 
                
              while (iterator.hasNext())  
              { 
                  
                  Edge e = iterator.next();
                  int v=e.vertex;
                  if(!visited.get(v)){
                      stack.push(v); 
                      stack1.push(e.weight);
                  } 
                      
              } 
                
          }
          System.out.println("\nPath cost: "+cost);
      }
}