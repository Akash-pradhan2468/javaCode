
package graph2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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
public class Creation {
	public static void creationgrapg(ArrayList<Edge>graph[]) {
//		Creating the graph in adjacency list form
//		that array size of vertex.easch index of arraylist of edges.
//		fisrt time array contains only null value in each index
//		to add we have to create empty arraylist in their
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();//This is for create empty arraylist
		}
		
//		now add edges in each list
		
		
		
		graph[0].add(new Edge(0,1,0));
		graph[0].add(new Edge(0,2,0));
		
		graph[1].add(new Edge(1,3,0));
		graph[1].add(new Edge(1,0,0));
		
		graph[2].add(new Edge(2,4,0));
		graph[2].add(new Edge(2,0,0));
		
		graph[3].add(new Edge(3,1,0));
		graph[3].add(new Edge(3,4,0));
		graph[3].add(new Edge(3,5,0));
		
		graph[4].add(new Edge(4,2,0));
		graph[4].add(new Edge(4,3,0));
		graph[4].add(new Edge(4,5,0));
		
		graph[5].add(new Edge(5,3,0));
		graph[5].add(new Edge(5,4,0));
		graph[5].add(new Edge(5,6,0));
		
		graph[6].add(new Edge(6,5,0));
		
		
	}
	public static void creationgrapg2(ArrayList<Edge>graph[]) {
//		Creating the graph in adjacency list form
//		that array size of vertex.easch index of arraylist of edges.
//		fisrt time array contains only null value in each index
//		to add we have to create empty arraylist in their
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();//This is for create empty arraylist
		}
		
//		now add edges in each list
		graph[0].add(new Edge(0,1,0));
		graph[1].add(new Edge(1,0,0));
		graph[1].add(new Edge(1,2,0));
		graph[2].add(new Edge(2,1,0));
		graph[3].add(new Edge(3,4,0));
		graph[4].add(new Edge(4,3,0));
	}
	public static void bfsLogic(ArrayList<Edge>graph[],boolean visited[],int start) {
		Queue<Integer>q=new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int cur=q.remove();
			if(visited[cur]==false) {
				System.out.print(cur+" ");
				visited[cur]=true;
				for(int i=0;i<graph[cur].size();i++) {
					Edge e=graph[cur].get(i);
					q.add(e.d);
				}
			}
		
	}
}
		
	public static void BFS(ArrayList<Edge>graph[]) {
		
		boolean visited[]=new boolean[graph.length];
		for(int j=0;j<visited.length;j++) {
			if(visited[j]==false) {
				bfsLogic(graph, visited, j);
				System.out.println();
			}
			
		}
		
	}
	public static void dfsLogic(ArrayList<Edge>graph[],int start,boolean visited[]) {
		System.out.print(start+" ");
		visited[start]=true;
		for(int i=0;i<graph[start].size();i++) {
			Edge e=graph[start].get(i);
			if(visited[e.d]==false) {
				dfsLogic(graph,e.d,visited);
			}
		}
	}
	public static void dfs(ArrayList<Edge>grapg[]) {
		
		boolean visited[]=new boolean[grapg.length];
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				dfsLogic(grapg, i, visited);
				System.out.println();
			}
		}
		
	}
	public static void printAllPathLogic(ArrayList<Edge>graph[],boolean visited[],int cur,int target,String path) {
		if(cur==target) {
			path=path+cur;
			System.out.println(path);
		}else {
			visited[cur]=true;
			for(int i=0;i<graph[cur].size();i++) {
				Edge e=graph[cur].get(i);
				if(visited[e.d]==false) {
					
					printAllPathLogic(graph, visited, e.d, target, path+cur);
					
				}
			}
			visited[cur]=false;
		}
	}
	public static void printAllpath(ArrayList<Edge>graph[],int s,int target) {
		
			boolean visited[]=new boolean[graph.length];
			printAllPathLogic(graph, visited, s, target,"");
		
	}
	public static void printNeighbours(ArrayList<Edge>graph[],int a) {
		
//		To find neighbour first go to arraylist present at 2nd
//		Then run a loop till it size ends
//		Each time we extract the obj of edge then excess its destination and print it
		for(int i=0;i<graph[a].size();i++) {
			Edge e=graph[a].get(i);
			System.out.println(e.d+" "+", "+e.w);
//			for both neighbor and the edge wight to reach neighbour
		}
		System.out.println();
	}
	public static void creation3(ArrayList<Edge>graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,1,0));
		graph[0].add(new Edge(0,4,0));
		
		graph[1].add(new Edge(1,0,0));
		graph[1].add(new Edge(1,2,0));
		graph[1].add(new Edge(1,4,0));
		
		graph[2].add(new Edge(2,1,0));
		graph[2].add(new Edge(2,3,0));
		
		
		graph[3].add(new Edge(3,2,0));
		
		graph[4].add(new Edge(4,0,0));
		graph[4].add(new Edge(4,1,0));
		graph[4].add(new Edge(4,5,0));
		
		graph[5].add(new Edge(5,4,0));
	}
	public static boolean isLoopLogic(ArrayList<Edge>graph[],boolean visited[],int cur,int parent) {
//		THis logic is aplicable for undirected graph
//		Process is first go to current node and and make it visited in list.then in a loop one by one get all
//		neighbour nodes .if neighbour is visited and not same as parent then return true.If neighbor is parent and 
//		visited then we do nothing.if neighbor is neither parent not visited that is visited false then we 
//		call recusive function isLoopLogic with cur=e.d that the neibor and parent is the cur.
//		if that function return true thrn retun true.if that function do not return true than we cant conclude that 
//		their is a loop or not
//		after all neighbor are traversed that the for loop is compleate then we can say that their is no loop
//		and returned false
		visited[cur]=true;
		for(int i=0;i<graph[cur].size();i++) {
			Edge e=graph[cur].get(i);
			
			if(visited[e.d]&&e.d!=parent) {
				return true;
			}else if(!visited[e.d]) {
				if(isLoopLogic(graph, visited, e.d, cur)) {
					return true;
				}
			}
			
		}
		return false;
	}
	public static boolean isLoop(ArrayList<Edge>graph[]) {
		boolean visited[]=new boolean[graph.length];
		return isLoopLogic(graph, visited, 0, -1);
	}
	
	public static void creatin4(ArrayList<Edge>graph[]) {
		
//		FOR CYCLE DETECTION IN DIRECTED GRAPH
		
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,2,0));
		
		graph[1].add(new Edge(1,0,0));
		
		graph[2].add(new Edge(2,3,0));
		
		
		graph[3].add(new Edge(3,0,0));
		
	}
	
	public static boolean cycleDetectionDirectedGraphLogic(ArrayList<Edge>graph[],boolean visited[],int cur,boolean rec[]) {
		visited[cur]=true;
		rec[cur]=true;
		for(int i=0;i<graph[cur].size();i++) {
			 Edge e=graph[cur].get(i);
			 if(rec[e.d]) {
				 return true;
			 }else if(!visited[e.d]) {
				 if(cycleDetectionDirectedGraphLogic(graph, visited, e.d, rec)) {
					 return true;
				 }
			 }
		}
		rec[cur]=false;
		return false;
	}
	public static boolean cycleDetectionDirectedGraph(ArrayList<Edge>graph[]) {
		boolean visited[]=new boolean[graph.length];
		boolean rec[]=new boolean[graph.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				boolean a=cycleDetectionDirectedGraphLogic(graph,visited,i,rec);
				if(a) {
					return true;
				}
			}
			
		}
		return false;
		
	}
	public static void creation5(ArrayList<Edge>graph[]) {

		//		TOPOLOGICAL SORTING GRAPH CREATION
		
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		graph[5].add(new Edge(5,2,0));
		graph[5].add(new Edge(5,0,0));

		graph[2].add(new Edge(2,3,0));
		
		graph[3].add(new Edge(3,1,0));
		
		graph[4].add(new Edge(4,0,0));
		graph[4].add(new Edge(4,1,0));
		
		
		
	}
	public static void topologicalSortLogic(ArrayList<Edge>graph[],boolean visited[],Stack<Integer>stk,int cur) {
		visited[cur]=true;
		for(int i=0;i<graph[cur].size();i++) {
			Edge e=graph[cur].get(i);
			if(!visited[e.d]) {
				topologicalSortLogic(graph, visited, stk, e.d);
			}
		}
		stk.push(cur);
	}
	public static void topologicalShort(ArrayList<Edge>graph[]) {
//		Topological Sort based on dependecy of a node to others as the loyest dependant node come first
//		to do this we make a stack and travers as in dfs in last node whose all neighbors are traversed that the 
//		most dependent node so push in stack.as it recrsively call the most independent node push to stack at last
//		at last we pop one by one from stack and get the order
//		we have to take care of disconnected compone so traverse alll node as for loop on visited array as useuall
//		Time complexcity is same as dfs O(v+e)
		boolean visited[]=new boolean[graph.length];
		Stack<Integer>stk=new Stack<>();
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				topologicalSortLogic(graph, visited, stk, i);
			}
		}
		while(!stk.isEmpty()) {
			System.out.print(stk.pop()+" ");
		}
		System.out.println();
	}
	
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
//		for(int i=0;i<dist.length;i++) {
//			System.out.print(dist[i]+" ");
//		}
		
//		System.out.println();
//		for(int i=0;i<path.length;i++) {
//			System.out.print(path[i]+" ");
//		}
		System.out.println("Path for your destination is  "+path[des]);
		System.out.println("Time for your destination is   "+dist[des]);
		System.out.println();
	}
	public static void project(ArrayList<Edge>graph[]) {
		creation5(graph);
		System.out.println("Enter sourse node of trafic");
		Scanner sc=new Scanner(System.in);
		int ts=sc.nextInt();
		System.out.println("Enter destination node of trafic");
		int td=sc.nextInt();
		System.out.println("Enter the trafic facter how much trafic present");
		int tfactor=sc.nextInt();
		for(int i=0;i<graph[ts].size();i++) {
			Edge e=graph[ts].get(i);
			if(e.d==td) {
				e.w=e.w*tfactor;
			}
		}
		projectBFS(graph);
		dijkestraALgo(graph);
	}
	public static void projectBfsLogic(ArrayList<Edge>graph[],boolean visited[],int start) {
		Queue<Integer>q=new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int cur=q.remove();
			if(visited[cur]==false) {
				System.out.print(cur+" ");
				visited[cur]=true;
				for(int i=0;i<graph[cur].size();i++) {
					Edge e=graph[cur].get(i);
					System.out.println(e.s+"  "+e.d+"  "+e.w+"Akash");
					q.add(e.d);
				}
			}
		
	}
}
		
	public static void projectBFS(ArrayList<Edge>graph[]) {
		
		boolean visited[]=new boolean[graph.length];
		for(int j=0;j<visited.length;j++) {
			if(visited[j]==false) {
				bfsLogic(graph, visited, j);
				System.out.println();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int v=7;
//ArrayList<Edge>graph[]=new ArrayList[v];
//creationgrapg(graph);
////printNeighbours(graph, 2);
////printNeighbours(graph, 1);
//BFS(graph);
//ArrayList<Edge>graph2[]=new ArrayList[5];
//creationgrapg2(graph2);
//BFS(graph2);
//dfs(graph2);
//dfs(graph);
//printAllpath(graph, 0, 5);
		
//		FOR CYCLE DETECTION IN UNDIRECTED GRAPH
		
//		ArrayList<Edge>graph3[]=new ArrayList[6];
//		creation3(graph3);
//		dfs(graph3);
//		System.out.println(isLoop(graph3));
		
//		FOR CYCLE DETECTION IN DIRECTED GRAPH
		
//		ArrayList<Edge>graph4[]=new ArrayList[4];
//		creatin4(graph4);
//		dfs(graph4);
//		System.out.println(cycleDetectionDirectedGraph(graph4));
//		
//		
////		TOPOLOGICAL SORTING
//		ArrayList<Edge>graph5[]=new ArrayList[6];
//		creation5(graph5);
//		topologicalShort(graph5);
		
		
		
//				DIJKESTR'S ALGORITHM
		ArrayList<Edge>graph5[]=new ArrayList[6];
		creat5(graph5);
//		project(graph5);
//		dijkestraALgo(graph5, 0);
//		BFS(graph5);
//		for(int i=0;i<graph5.length;i++) {
//			for(int j=0;j<graph5[i].size();j++) {
//				Edge e=graph5[i].get(j);
//				System.out.println(e.s+" "+e.d+" "+e.w);
//			}
//		}
//		System.out.println("Djkestra");
//		dijkestraALgo(graph5);
//		for(int i=0;i<graph5[2].size();i++) {
//			Edge e=graph5[2].get(i);
//			if(e.d==4) {
//				e.w=e.w*2;
//			}
//		}
		
//		BFS(graph5);
//		for(int i=0;i<graph5.length;i++) {
//			for(int j=0;j<graph5[i].size();j++) {
//				Edge e=graph5[i].get(j);
//				System.out.println(e.s+" "+e.d+" "+e.w);
//			}
//		}
//		System.out.println("Dijkestra 2");
		dijkestraALgo(graph5);
		
		
	}

}
