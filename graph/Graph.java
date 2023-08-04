package graph;
import java.util.*;
class edge{
	int s;
	int d;
	int wt;
	edge(int s,int d,int wt){
		this.s=s;
		this.d=d;
		this.wt=wt;
	}
}
public class Graph {
	public static void creatGraph(ArrayList<edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<edge>();
		}
//		graph[0].add(new edge(0, 2,10));
//		graph[1].add(new edge(1,2,12));
//		graph[1].add(new edge(1,3,20));
//		graph[2].add(new edge(2,0,10));
//		graph[2].add(new edge(2,1,12));
//		graph[2].add(new edge(2,3,15));
//		graph[3].add(new edge(3,1,20));
//		graph[3].add(new edge(3,2,15));
		graph[0].add(new edge(0,1,1));
		graph[0].add(new edge(0,2,1));
		graph[1].add(new edge(1,0,1));
		graph[1].add(new edge(1,3,1));
		graph[2].add(new edge(2,0,1));
		graph[2].add(new edge(2,4,1));
		graph[3].add(new edge(3,1,1));
		graph[3].add(new edge(3,4,1));
		graph[3].add(new edge(3,5,1));
		graph[4].add(new edge(4,2,1));
		graph[4].add(new edge(4,3,1));
		graph[4].add(new edge(4,5,1));
		graph[5].add(new edge(5,3,1));
		graph[5].add(new edge(5,4,1));
		graph[5].add(new edge(5,6,1));
		graph[6].add(new edge(5,6,1));
	}
	public static void bfs(ArrayList<edge>graph[],int v) {
		Queue<Integer>q=new LinkedList<>();
			q.add(0);
			boolean vist[]=new boolean[v];
			while(!q.isEmpty()) {
				int cur=q.remove();
				if(vist[cur]==false) {
					System.out.print(cur+"  ");
					vist[cur]=true;
					for(int i=0;i<graph[cur].size();i++) {
						q.add(graph[cur].get(i).d);
					}
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<edge> graph[]=new ArrayList[7];
creatGraph(graph);
//Neighbour of 2
for(int i=0;i<graph[2].size();i++) {
	System.out.println(graph[2].get(i).d+" , "+graph[2].get(i).wt);
}
bfs(graph,7);
System.out.println();
	}

}
