package recursion;
import java.util.Scanner;
public class ReverseOfANumber {
public static void reverse(int a) {
if(a<10) {
	System.out.print(a);
	System.out.println();
	return;
	}
	System.out.print(a%10);
	 reverse(a/10);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
System.out.println("Reverse of the number is ");
reverse(num);
	}

}
