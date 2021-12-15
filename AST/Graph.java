package AST;
import java.util.*; 
class Graph 
{ 
	
    private int V;   // Numero de vertices
    private LinkedList<Edge> adj[]; //Adjacency Lists
    static String[] cities;
  
    @SuppressWarnings({ "unchecked", "static-access", "rawtypes" })
	Graph(int v,String[] cities) 
    { 
        this.V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
        this.cities=cities;
    }
   
    void addEdge(int fromVertex,int toVertex,int weight) 
    { 
        Edge e=new Edge(toVertex,weight);
        adj[fromVertex].add(e);
    } 
  @Override
	public String toString(){
		String result="";
               
		for(int i=0;i<adj.length;i++)
                       
			result+=cities[i]+"=>"+adj[i]+"\n";
		return result;
	}
    
    void AST(int s,int goal) {
    	//índice de hueristas corresponde ao nome da cidade
    	//As cidades são inseridas de acordo com o índice
    	int[] hueristic = {366,329,253,374,244,193,178,380,241,160
    						,98,0,242,77,80,151,161,199,226,234};
    	
    	String[] hueristicPlusCost=new String[V];
    	int[] hpc=new int[V];
    	int[] weight= new int[V]; 
    	Comparator<Integer> hueristicComparator= new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return hpc[o1]-hpc[o2];
			}
		};
    	
    	int[] cityCost=new int[V];
    	String[] cityPath = new String[V];
        boolean visited[] = new boolean[V]; 
        PriorityQueue<Integer> queue = new PriorityQueue<>(hueristicComparator);
        
        hpc[s]=weight[s]+hueristic[s];
        hueristicPlusCost[s]="Weight:"+weight[s]+", Hueristic:"+hueristic[s]
        		+"Total= "+(weight[s]+hueristic[s]);
        
        visited[s]=true; 
        queue.add(s);
        weight[s]=0;
        cityPath[s] = cities[s]; //cidade de partida
        cityCost[s] = 0; //custo inicial
        
        @SuppressWarnings("unused")
		boolean stopNow=false;
        while (queue.size() != 0) 
        {
            System.out.print(cities[s]+": "); 
        	printPriorityQueue(queue);
            s = queue.poll();
            
            if(s==goal)break;
           
            Iterator<Edge> i = adj[s].listIterator(); 
            int n;
            
            while (i.hasNext()) 
            { 
                Edge e = i.next();
                n=e.vertex;
                
                if (!visited[n]) 
                {   
                	cityPath[n]=cityPath[s]+"-->"+cities[n];
                	cityCost[n]=cityCost[s]+e.weight;
                	weight[n]=cityCost[n];
                	
                	hpc[n]=weight[n]+hueristic[n];
                	hueristicPlusCost[n]="Weight:"+weight[n]+", Hueristic:"+hueristic[n]
                    		+"Total= "+(weight[n]+hueristic[n]);
                	
                    visited[n] = true; 
                    queue.add(n);
                }
            } 
        } 
        System.out.print(cities[s]+": ");
        printPriorityQueue(queue);
        
        System.out.println("\nPath is: "+cityPath[s]);
        System.out.println("Cost is: "+cityCost[s]);

    }
    
    static void printHueristic(int[] hueristic) 
    {	
    	System.out.println("Hueristics are:");
    	for (int i = 0; i < hueristic.length; i++) {
			System.out.println(cities[i]+":"+hueristic[i]);
		}
    	
    }
    
    static void printStringArray(String[] path) 
    {
    	for (int i = 0; i < path.length; i++) {
			if(path[i]!=null)
				System.out.println(cities[i]+":"+path[i]);
		}
    	
    }
    
    static void printHueristicPlusCost(String[] hc) {
    	System.out.println("=====Hueristic + Cost=======");
    	for (int i = 0; i < hc.length; i++) {
			if (hc[i]!=null) {
				System.out.println(cities[i]+": "+hc[i]);
			}
		}
    	System.out.println("=====Hueristic + Cost=======");
    }
    
    static void printIngeterArray(int[] weight) 
    {
    	String s="";
    	for (int i = 0; i < weight.length; i++) {
			if (weight[i]!=0) {
				s+=cities[i]+":"+weight[i]+" ";
			}
		}
    	System.out.println(s);
    }
    
    static void printPriorityQueue(PriorityQueue<Integer> queue) 
    {
    	String s="";
    	for (Integer integer : queue) {
			s+=cities[integer]+"-->";
		}
    	System.out.println(s);
    }
    
    static void printStack(Stack<Integer> stack) {
    	String s="";
    	for (Integer vertex : stack) {
    		s+=cities[vertex]+"-->";
		}
    	System.out.println(s);
    }
   
    static void printQueue(LinkedList<Integer> queue) {
    	String s="";
    	for (Integer value : queue) {
			s+=cities[value]+"-->";
		}
    	System.out.println(s);
    }
    
}