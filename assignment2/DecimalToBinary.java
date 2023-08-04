package assignment2;
import java.util.Scanner;
import java.util.Stack;
public class DecimalToBinary {
public static void DecimalTOBinary(int a) {
	Stack<Integer>st=new Stack<>();
	
	while(a>1) {
		st.push(a%2);
		a=a/2;
	}
	if(a<=1) {
		st.push(1);
	}
	String s="";
	while(!st.isEmpty()) {
		s=s+st.pop();
	}
	System.out.println(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number that you want to convert decimal to binary");
int a=sc.nextInt();
DecimalTOBinary(a);
	}

}
