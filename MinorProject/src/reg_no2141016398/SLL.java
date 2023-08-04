package reg_no2141016398;
import java.util.Scanner;
class node{
	int info;
	node link;
}
public class SLL {
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
} public static int find2max(node p) {
	node temp=p;
	int max=temp.info;
	int max2=temp.info;
	temp=temp.link;
	while(temp!=null) {
          if(temp.info>max) {
	        max2=max;
	       	max=temp.info;
          }
          if(temp.info>max2&&temp.info<max) {
        	  max2=temp.info;
          }
          temp=temp.link;
	}
	return max2;
}
public static int search(node p) {
	System.out.println("Which element do you want to find");
	int a=sc.nextInt();
	int pos=0;
	node temp=p;
	while(temp!=null) {
		pos++;
		if(a==temp.info) {
			return pos;
		}
		temp=temp.link;
	}
	return -1;
	
}
public static void removeduplicate(node p) {
node temp=p;
while(temp!=null) {
	node pre=temp;
	node cur=temp.link;
	while(cur!=null) {
		if(temp.info==cur.info) {
			pre.link=cur.link;
			cur=cur.link;
		}else {
			cur=cur.link;
			pre=pre.link;
			
		}
	}
	temp=temp.link;
}
}
public static int countUnique(node p) {
node temp=p;
int unique=0;
while(temp!=null) {
	int count=0;
	node temp2=p;
	while(temp2!=null) {
		if(temp.info==temp2.info&&temp!=temp2) {
			count++;
		}
		temp2=temp2.link;
	}
	if(count==0) {
		unique++;
	}
	temp=temp.link;
}
return unique;
}

public static void shortsll(node head) {
	node temp=head;
	while(temp.link!=null) {
		//System.out.println("Akash");
		node temp2=temp.link;
		while(temp2!=null) {
			int c=temp.info;
			if(temp.info>temp2.info) {
				temp.info=temp2.info;
				temp2.info=c;
			}
			temp2=temp2.link;
		}
		temp=temp.link;
	}
}
public static void reverse(node p) {
	node cur=p;
	node pre=null;
	node next=cur.link;
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
		 System.out.println("3:Find2max");
		 System.out.println("4:Search");
		 System.out.println("5:RemoveDuplicate");
		 System.out.println("6:CountUnique");
		 System.out.println("7:Shorting");
		 System.out.println("8:Reverse");
		 System.out.println("Enter the choice");
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
		 int c=find2max(head);
		 System.out.println("Second max is "+c);
		 break;
		 case 4:
			 int d=search(head);
			 System.out.println("Your element is at position  "+d );
			 break;
		 case 5:
			 removeduplicate(head);
			 break;
		 case 6:
			 int s=countUnique(head);
			 System.out.println("Number of unique element is "+s);
			 break;
		 case 7:
			 shortsll(head);
			 break;
		 case 8:
			 reverse(head);
			 break;
		 default:
		 System.out.println("Wrong choice");
		 
		 }
		 }

		
	}

}
