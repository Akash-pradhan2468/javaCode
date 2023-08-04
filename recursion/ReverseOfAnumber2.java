package recursion;
import java.util.Scanner;
public class ReverseOfAnumber2 {
public static void print(String a,int k) {
	if(k==0) {
		System.out.print(a.charAt(k));
	}else {
		System.out.print(a.charAt(k));
	print(a, k-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String ");
String a=sc.nextLine();
int k=a.length()-1;	
	print(a, k);
}

}
