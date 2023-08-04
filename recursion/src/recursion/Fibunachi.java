package recursion;
import java.util.Scanner;
public class Fibunachi {
public static void printFibunachi(int a,int b,int c) {
	if(c==0) {
		return;
	}
	int trd=a+b;
	System.out.print(trd+" ");
	printFibunachi(b, trd, c-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many number you need in fibunachi sequence ");
int n=sc.nextInt();
System.out.print(a+" ");
System.out.print(b+" ");
int g=n-2;
printFibunachi(a, b, g);

	}

}
