package assignment2;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;
class Adress{
	String plotNo;
	String at;
	String po;
	public Adress(String a,String b,String c) {
		this.plotNo=a;
		this.at=b;
		this.po=c;
	}
}
public class PartB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer>a=new TreeSet<>();
a.add(10);
a.add(20);
a.add(30);
System.out.println("Enter an element to search");
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
System.out.println(b +" is present in Tree set "+ a.contains(b));
System.out.println(a);
TreeMap<String,Adress>c=new TreeMap<>();
Adress d=new Adress("B123","Sunhat","Sunhat");
Adress e=new Adress("c123","AryaVillage","Jagamara");
Adress f=new Adress("d173","Khandagiri","Jagamara");

c.put("Akash", d);
c.put("Amartya", e);
c.put("Navin", f);
System.out.println(c);
LinkedHashSet<Double>lhs=new LinkedHashSet<>();
lhs.add(10.2);
lhs.add(12.2);
lhs.add(15.2);
System.out.println(lhs);

	}

}
