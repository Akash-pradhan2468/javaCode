//Akash pradhan 2141016398
package adProjet;
import java.util.*;



class Edge{
	int s;		//Edge contains Source , destination and Weight
	int d;		//For un weighted graoh w value either 0 or same for all
	int w;
	public Edge(int s,int d,int w) {  //Create the egde class for create the  edge
		this.s=s;
		this.d=d;
		this.w=w;
	}
}
public class Project {
//	DIJKESTRA'S GRAPH CREATION
	public static void creat5(ArrayList<Edge>graph[]) {
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("We have to get the infermation about the trafic factor of the road here i just try "
				+ "implent only one road that effected by trafic ");
		System.out.println("If any road is effected by trafic then enter 1 else enter 0");
		int m=s.nextInt();
		if(m==1) {
		System.out.println("Enter the soure node of the road that effect by the trafic");
		int ts=s.nextInt();
		System.out.println("Enter the destination of the road that effected by trafic");
		int td=s.nextInt();
		System.out.println("Enter the time facter means how much time the extratime "
				+ "require to cover the road comparision to the average time");
		int tf=s.nextInt();
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));

		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,7));

		graph[2].add(new Edge(2,4,3));

		graph[3].add(new Edge(3,5,1));

		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
		for(int i=0;i<graph[ts].size();i++) {
			Edge e=graph[ts].get(i);
			if(e.d==td) {
				e.w=e.w*tf;
			}
		}
		}else {
				for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));

		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,7));

		graph[2].add(new Edge(2,4,3));

		graph[3].add(new Edge(3,5,1));

		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
		
		}
		System.out.println("Graph is ready to implement the dijkstras algorithm ");

		
	}
	public static class Pair implements Comparable<Pair>{
//		Comparerable interface anable a class to define by which way we can sort this class by node or by dist
//		thats why we have to over ride compareTo function and define the logic
		int node;
		int dist;
		String path="";
		public Pair(int n,int d,String a) {
			this.node=n;
			this.dist=d;
			this.path=a;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.dist-p2.dist;//Assending order logic
//			return p2.dist-this.dist   Desending Oredr logic
		}
	}
	public static void dijkestraALgo(ArrayList<Edge>graph[]) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the source node of your jouney");
		int src=s.nextInt();
		System.out.println("Enter the destination of your jouney");
		int des=s.nextInt();
		PriorityQueue<Pair>pq=new PriorityQueue<>();
		boolean visited[]=new boolean[graph.length];
		String path[]=new String[graph.length];
		for(int i=0;i<path.length;i++) {
			path[i]="";
		}
//		Create a dis array that contains all distance from souse at first souse have 0 distance and other 
//		have distance ==Infinite that is Integer.Max_VALUE
		int dist[]=new int[graph.length];
		for(int i=0;i<dist.length;i++) {
			if(src!=i) {
				dist[i]=Integer.MAX_VALUE;
			}
		}
		pq.add(new Pair(src,0,""+src));
		path[0]=""+src;
		while(!pq.isEmpty()) {
			Pair cur=pq.remove(); 
			if(!visited[cur.node]) {
				visited[cur.node]=true;
				for(int i=0;i<graph[cur.node].size();i++) {
					Edge e=graph[cur.node].get(i);
					int u=e.s;
					int v=e.d;
					if(dist[u]+e.w<dist[v]) {
						dist[v]=dist[u]+e.w;
						path[v]=path[u]+v;
						pq.add(new Pair(v,dist[v],path[v]));
					}
				}
			}
		}


		System.out.println("Path for your destination is  "+path[des]);
		System.out.println("Time for your destination is   "+dist[des]);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Edge>graph5[]=new ArrayList[6];
		creat5(graph5);
		dijkestraALgo(graph5);
	}

}
