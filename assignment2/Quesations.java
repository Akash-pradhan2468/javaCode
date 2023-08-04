package assignment2;
import java.util.LinkedList;
import java.util.Scanner;
class Quesations {
public static void linkedList() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer>li=new LinkedList<>();
for(int i=0;i<10;i++) {
	li.add(i+10);
}
System.out.println(li);
System.out.println("Enter the elemernt that you want to search");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("Element "+a +" is Present "+li.contains(a));
System.out.println("Is the Linknekd is Empty "+li.isEmpty());
System.out.println("Enter the position that you want to delete ");
int b=sc.nextInt();
li.remove(b);
System.out.println(li);
	}

}
