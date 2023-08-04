package labPractice;

import java.util.Scanner;

class node3{
	int info;
	node3 next;
}
public class LinkLEdlist {
static node3 head=null;
static Scanner sc=new Scanner(System.in);
public static void creat() {
node3 q=new node3();
System.out.println("Enter the info");
q.info=sc.nextInt();
q.next=null;
head=q;
System.out.println("Want to creat more node y/n");
char ch=sc.next().charAt(0);
while(ch!='n') {
	node3 p=new node3();
	System.out.println("Enter the info part");
	p.info=sc.nextInt();
	p.next=null;
	q.next=p;
	q=p;
	System.out.println("Want to creat more node y/n");
	 ch=sc.next().charAt(0);
}
}
public static void display() {
	node3 temp=head;
	while(temp!=null) {
		System.out.print(temp.info+"----->>");
         temp=temp.next;
	}
	System.out.println();
}
public static void insertBeg(node3 p) {
	p.next=head;
	head=p;
}
public static void insertEnd(node3 p) {
	node3 temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=p;
}
public static int count() {
	node3 temp=head;
	int a=0;
	while(temp!=null) {
		a++;
		temp=temp.next;
	}
	return a;
}
public static void insertAny() {
	System.out.println("Enter Possition");
	int pos=sc.nextInt();
	node3 q=new node3();
	System.out.println("Enter the info part");
	q.info=sc.nextInt();
	q.next=null;
	if(pos==0) {
		insertBeg(q);
	}
	
	else if(pos==count()+1) {
		insertEnd(q);
	}else {
		node3 temp=head; 
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		q.next=temp.next.next;
		temp.next=q;
	}
}
public static void deletbeg() {
	if(head==null) {
		System.out.println("Under flow");
		return;
	}
	head=head.next;
}
public static void deleteEnd() {
	node3 temp=head;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	temp.next=null;
}
public static void deleteAny() {
	System.out.println("Enter the position");
	int x=sc.nextInt();
	if(x==0) {
		deletbeg();
	}else if(x==count()) {
		deleteEnd();
	}else {
		 node3 temp=head;
		for(int i=1;i<x-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
while(true) {
	System.out.println("***MENU***");
	System.out.println("0:Exit");
	System.out.println("1:Creat");
	System.out.println("2:Display");
	System.out.println("3:InsertAny");
	System.out.println("4:DeleteAny");	
	System.out.println("Enter choice");
	a=sc.nextInt();
switch(a) {
case 0:
	System.exit(0);
case 1:
	creat();
	break;
case 2:
	display();
	break;
case 3:
	insertAny();
	break;
case 4:
	deleteAny();
	break;
	default:
		System.out.println("Wrong choice");
}
}
	}

}
