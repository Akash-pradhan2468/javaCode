package hashSet;
import java.util.Scanner;
class node{
	int info;
	node next;
}
public class Q3 {
static Scanner sc=new Scanner(System.in);
static node start;
public static void creat(){
	node p=new node();
	System.out.println("Enter the info");
	p.info=sc.nextInt();
	p.next=null;
	start=p;
	char ch;
	System.out.println("Want to creat more node y/n");
    ch=sc.next().charAt(0);
	while(ch!='n') {
		node q=new node();
		System.out.println("Enter the info");
		q.info=sc.nextInt();
		q.next=null;
		p.next=q;
		p=q;
	System.out.println("Want to creat more node y/n");
	ch=sc.next().charAt(0);
	}
	
}
public static void display() {
	node temp=start;
	while(temp!=null) {
		System.out.print(temp.info+"--->>");
		temp=temp.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
		while(true) {
			System.out.println("***MENU***");
			System.out.println("0:EXIT");
			System.out.println("1:CREAT");
			System.out.println("2:Display");
			System.out.println("Choice");
			a=sc.nextInt();
			
			switch(a){
			case 0:
				System.exit(0);
			case 1:
				creat();
				break;
			case 2:
				display();
			break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}

}
