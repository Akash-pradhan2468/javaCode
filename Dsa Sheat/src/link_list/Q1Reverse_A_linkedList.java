package link_list;
import java.util.Scanner;
class node{
	int info;
	node link;
}

public class Q1Reverse_A_linkedList {
	public static node head=null;
	public static Scanner sc=new Scanner(System.in);
	public static void create(node p) {
		p=new node();
		System.out.println("Enter the info part");
		p.info=sc.nextInt();
		p.link=null;
		head=p;
		System.out.println("Do you want to creat more nodes y/n");
		char ch=sc.next().charAt(0);
		while(ch!='n') {
			node q=new node();
			System.out.println("Enter the info part");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			System.out.println("Do you want to creat more nodes y/n");
			 ch=sc.next().charAt(0);
		}
	}
	public static void display(node p) {
		node temp=p;
		while(temp!=null) {
			System.out.print(temp.info+"->");
			temp=temp.link;
		}
		System.out.println();
	}
	public static void reverse(node p) {
		node cur=p;
		node pre=null;
		node next=p.link;
		cur.link=null;
		while(next!=null) {
			pre=cur;
			cur=next;
			next=next.link;
			cur.link=pre;
		}
		head=cur;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		while(true)
		{
		 System.out.println("****MENU*****");
		 System.out.println("0:Exit");
		 System.out.println("1:Creation");
		 System.out.println("2:Display");
		 System.out.println("3:Reverse");
		 choice=sc.nextInt();
		 switch(choice)
		 {
		 case 0:
		 System.exit(0);
		 case 1:
		 create(head);
		 break;
		 case 2:
		 display(head);
		 break;
		 case 3:
			 reverse(head);
			 break;
	
		 default:
		 System.out.println("Wrong choice");
		 
		 }
		 }
	}

}
