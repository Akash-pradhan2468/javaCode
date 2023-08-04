import java.util.Scanner;

public class Q2_1 {
public static void printArray(String a[],int b) {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<b;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the order of the graph ");
int order=sc.nextInt();
sc.nextLine();
String vertexArra[]=new String[order];
System.out.println("Enter your vertex ");
for(int i=0;i<order;i++) {	
	vertexArra[i]=sc.next();
}
System.out.println("Enter the size of the graph ");
int size=sc.nextInt();
sc.nextLine();
String edgesArray[]=new String[size];
System.out.println("Enter your edges ");
for(int i=0;i<size;i++) {	
	edgesArray[i]=sc.next();
}
int noeocg=(order*(order-1))/2;
String comGraphEdges[]=new String[noeocg];
int m=0;
for(int i=0;i<order-1;i++) {
	for(int j=i+1;j<order;j++) {
		comGraphEdges[m]=vertexArra[i]+vertexArra[j];
		m++;
	}
}
printArray(comGraphEdges,noeocg);

printArray(edgesArray,size);
for(int i=0;i<noeocg;i++) {
	int y=0;
	for(int j=0;j<size;j++) {	
		if(comGraphEdges[i].equals(edgesArray[j])) {
			y++;//To compair string  we have to use String.equals(String);
		}
	}
	if(y<1) {
		System.out.print(comGraphEdges[i]+" ");
		}
	
}

	}

}
