package assignment2;
import java.util.LinkedList;
import java.util.Scanner;
class Student{
	String name;
	int age;
	int  mark;
	public Student(String name,int age,int mark) {
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
}

public class ClassLinkedList {
	public static boolean isStudentPresent(LinkedList<Student>li,String a) {
		boolean b=false;
		for(int i=0;i<li.size();i++) {
			if(li.get(i).name.equals(a)) {
				b=true;
			}
		}
		return b;
	}
	public static void deleteStudentDetatils(LinkedList<Student>li,String temp) {
		for(int i=0;i<li.size();i++) {
			if(li.get(i).name.equals(temp)) {
				li.remove(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Student>li=new LinkedList<>();
Student Akash=new Student("Akash",21,99);
Student Sagar=new Student("Sagar",26,95);
Student Satyam=new Student("Satyam",20,69);
li.add(Akash);
li.add(Satyam);
li.add(Sagar);
for(int i=0;i<li.size();i++) {
	System.out.print(li.get(i).name+" ");
}
System.out.println();
System.out.println("Enter the name of the student that  you want to search");
Scanner sc=new Scanner(System.in);
String temp=sc.nextLine();
System.out.println(isStudentPresent(li, temp));
System.out.println("Enter the name of the student whoum you want to delete");
String temp2=sc.nextLine();
deleteStudentDetatils(li, temp2);
for(int i=0;i<li.size();i++) {
	System.out.print(li.get(i).name+" ");
}
System.out.println();
System.out.println("Total number of student "+li.size());
	}

}
