package labPractice;
import java.util.Scanner;
class node{
	char info;
	node next;
}
public class IspalindromStack {
	static node top=null;
	
	
public static boolean isPalindrom(String a) {
	char arr[]=a.toCharArray();
	if(arr.length%2==0) {
		for(int i=0;i<arr.length/2;i++) {
			push(arr[i]);
		}
		for(int i=arr.length/2;i<=arr.length;i++) {
			if(pop()!=arr[i]) {
				return false;
			}
		}
		return true;
	}else {
		for(int i=0;i<arr.length/2;i++) {
			push(arr[i]);
		}
		for(int i=(arr.length/2)+1;i<=arr.length;i++) {
			if(pop()!=arr[i]) {
				return false;
			}                                                                                                                                                                                                                                                                                                                                                                   
	}
		return true;
		}
}
public static void push(char x) {
	node q=new node();
	q.info=x;
	q.next=null;
	if(top==null) {
		top=q;
	}else {
		q.next=top;
		top=q;
	}
}
public static void display() {
	node temp=top;
	if(temp==null) {
		System.out.println("Under flow");
		}
	else {
		System.out.print(temp.info+" ");
		temp=temp.next;
	}
	System.out.println();
}
public static  char pop() {
	node temp=top;
	if(top==null) 
	{
		System.out.println("Under flow");
		return 'u';
	}else {
		temp=top;
		top=top.next;
		return temp.info;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(true) {
System.out.println("Enter the string to check palindrom"); 
String a=sc.nextLine();
System.out.println(isPalindrom(a));
}

	}

}
