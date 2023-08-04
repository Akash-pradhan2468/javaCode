package linked_List;
import java.util.Scanner;
public class LinkedListUse {
public static Node<Integer> creatLinkedList(){
//	Scanner sc=new Scanner(System.in);
//	System.out.println("If you want to creat Node click Y or Click N");
//	char a=sc.next().charAt(0);
//	Node<Integer> head;
//	while(a!='N') {
//		System.out.println("Enter the Data");
//		int temp=sc.nextInt();
//		Node<Integer>b=new Node(temp);
//	}
	
	Node<Integer>n1=new Node<>(10);
	Node<Integer>n2=new Node<>(29);
	Node<Integer>n3=new Node<>(36);
	Node<Integer>n4=new Node<>(56);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	return n1;
}
public static void print(Node<Integer> n1) {
	Node<Integer> temp=n1;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Node<Integer> n1=new Node<>(10);
//System.out.println(n1);
//System.out.println(n1.data);
//System.out.println(n1.next);
		Node<Integer>head=creatLinkedList();
		print(head);
	}

}
