import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the order of the graph");
int n=sc.nextInt();
sc.nextLine();
String arr[]=new String[n];
for(int i=0;i<n;i++) {
	//System.out.println("Enter the vertises of the graph");
	arr[i]=sc.next();
}
System.out.println("Enter the size of your graph ");
int k=sc.nextInt();
sc.nextLine();
String Eg[]=new String[k];
for(int i=0;i<k;i++) {
	System.out.println("Enter the edge");
	Eg[i]=sc.next();
}
System.out.println("Your complimentary grapg edges are ");
for(int i=0;i<n-1;i++) {
	for(int j=i+1;j<n;j++) {
		String m=arr[i]+arr[j];
	for(int l=0;l<k;l++) {
		int p=0;
		if(Eg[l]==m) {
			p++;
		}
		if(p==0) {
			System.out.println(m+"% ");
		}
	}
	}
}
	}

}
