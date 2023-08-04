import java.util.Scanner;
public class Assignment_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the order of the graph");
int order=sc.nextInt();
String array[]=new String[order];
sc.nextLine();
System.out.println("Enter the name of your vertexes");
for(int i=0;i<order;i++) {
	array[i]=sc.next();
}
System.out.println("Your Edges of the graph are");
for(int i=0;i<order-1;i++) {
	for(int j=i+1;j<order;j++) {
		System.out.print(array[i]+""+array[j]+" ");
	}
}
	}

	
}
