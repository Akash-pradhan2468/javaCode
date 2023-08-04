import java.util.Scanner;
public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the order of the graph");
int order=sc.nextInt();
for(int i=1;i<order;i++) {
	for(int j=i+1;j<=order;j++) {
		System.out.print(i+""+j+" ");
	}
}
	}

}
