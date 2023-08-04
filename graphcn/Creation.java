package graphcn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//DFS TRAVERSAL LOGIC PART 
public class Creation {
	public static void dfslogic(int adjM[][],int sNode,boolean visitedarr[]) {
		visitedarr[sNode]=true;
		System.out.print(sNode+" ");
		for(int i=0;i<adjM.length;i++) {
//			IF FIND A NODE 1 AND IT IS UNVISITED THEN CALL
//			AUTOMATICLY IT PRINT AND ADD TRUE IN VISITED 
//			ARRAY RECURSSIFLY
			if(adjM[sNode][i]==1&&visitedarr[i]==false) {
				dfslogic(adjM, i, visitedarr);
			}
		}

	}
//	DFS traversal
public static void dfs(int adjM[][]) {
//	Created a  Visited array
	boolean visitedarr[]=new boolean[adjM.length];
//	IF THE GRAPG HAS DISCONCENTED COMPONENT
	for(int i=0;i<visitedarr.length;i++) {
		if(visitedarr[i]==false) {
	dfslogic(adjM, i, visitedarr);
	System.out.println();
		}	
	}
	
}
//BFS TRAVERSAL
public static void bfs(int adjM[][]) {
	boolean visited[]=new boolean[adjM.length];
	for(int i=0;i<visited.length;i++) {
//THIS IS DUE TO TRAVERSE IN DICONECTED GRAPG
		if(visited[i]==false) {
			Queue<Integer>remaningNodes=new LinkedList<>();
			remaningNodes.add(i);
			visited[i]=true;
			while(!remaningNodes.isEmpty()) {
//				TAKE THE FIRST NODE FROM QUEUE THEN ADD ITS ADJACENT VERTICES
				int curnode=remaningNodes.poll();
				System.out.print(curnode+" ");
				for(int j=0;j<adjM.length;j++) {
					if(adjM[curnode][j]==1&&visited[j]==false) {
						remaningNodes.add(j);
						visited[j]=true;
					}
				}
			
		}
			System.out.println();
	
}
	
	}
		}	
	
//PATH EXIST OR NOT USING DFS
public static  boolean findpathlogicDFS(int adjM[][],int s,int d,boolean visited[]) {
	if(s==d) {
		return true;
	}
	for(int i=0;i<adjM.length;i++) {
		if(visited[i]==false&&adjM[s][i]==1) {
			visited[i]=true;
			return findpathlogicDFS(adjM, i, d, visited);
		}
	}
	return false;
	
}

public static boolean findPathDfs(int adjM[][],int s,int d) {
	boolean visited[]=new boolean[adjM.length];
	visited[s]=true;
	return findpathlogicDFS(adjM, s, d, visited);
	
}
//PATH EXIST OR NOT USING BFS
	public static boolean findPathBFS(int adjM[][],int s,int d) {
		Queue<Integer>remaningNodes=new LinkedList<>();
		boolean visited[]=new boolean[adjM.length];
		remaningNodes.add(s);
		while(!remaningNodes.isEmpty()) {
			int cur=remaningNodes.poll();
			if(cur==d) {
				return true;
			}
			
			for(int i=0;i<adjM.length;i++) {
				if(adjM[cur][i]==1&&visited[i]==false) {
					visited[i]=true;
					remaningNodes.add(i);
				}
			}
		}
		return false;
		
	}
	public static ArrayList<Integer> getpathLogic(int adjM[][],int s,int d,ArrayList<Integer>ans,boolean visited[]){

			visited[s]=true;
			if(s==d) {
				ans.add(s);
				return ans;
			}else {
				for(int j=0;j<adjM.length;j++) {
					if(adjM[s][j]==1&&visited[j]==false) {
						visited[j]=true;
						ArrayList<Integer>a= getpath(adjM, j, d);
						if(a.size()!=0) {
							a.add(j);
						}
					}
				}
				return ans;
			}
		
	}
public static ArrayList<Integer> getpath(int adjM[][],int s,int d){
	ArrayList<Integer>ans=new ArrayList<>();
	boolean visited[]=new boolean[adjM.length]; 
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Creating the Adjacency matrix For the graph
//		System.out.println("Enterr the number of vertises in the graph");
//	System.out.println("Enter the graph");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		System.out.println("Enter the number of edges in the graph");
		int e=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<e;i++) {
//			System.out.println("Enter the insidence vertises of your edges");
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[a][b]=1;//here we set 1 in 2d matrix  a b position
			arr[b][a]=1;//here we set 1 in 2d matrix  b a position
		}
//		Here I print the adjacency matrix of the graph
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
//		dfs traverse
//		dfs(arr);
//		bfs(arr);
//		System.out.println("Enter your sourse and destination to find out the path");
//		int s=sc.nextInt();
//		int d=sc.nextInt();
//		System.out.println("Path exist "+findPathDfs(arr, s, d));
		
//		dfs(arr);
		bfs(arr);
		System.out.println(findPathBFS(arr, 4, 5));
		ArrayList<Integer>a=getpath(arr, 0, 3);
		System.out.println(a);
	}

}
