package recursion;
import java.util.Scanner;
public class ReverseofaString {
public static void printreverse(String arr[],int ab) {
	if(ab==0) {
		System.out.print(arr[ab]);
		return;
	}else {
	System.out.print(arr[ab]);
	printreverse(arr,ab-1);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your String");
String a=sc.nextLine();
String arr[]=a.split("");
int ab=arr.length-1;
printreverse(arr, ab);

	}

}
