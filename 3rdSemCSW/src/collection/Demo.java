package collection;
import java.util.*;
public class Demo {

	private static final int ListIterator = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 type safe mathode
 type unsafe methode
 */
		ArrayList<String>arr=new ArrayList<>();//Type Safe type
		arr.add("akash");
		arr.add("sagar");
		arr.add("A");
		arr.add("A");
		arr.add("A");
//		System.out.println(arr.get(1));
		System.out.println(arr);
		/*LinkedList a=new LinkedList();//Type Unsafe type
		a.add(1);
		a.add("Akash");
		System.out.println(a);*/
		arr.remove(1);
		System.out.println(arr);
		arr.remove("A");
		System.out.println(arr);
		arr.add(1,"Sagar");
		arr.set(3, "Satyam");
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.contains("akash"));
		Vector<String>v=new Vector<>();
		v.addAll(arr);
		System.out.println(v);
		System.out.println("________________________________________________________");
		HashSet<Double>c=new HashSet<>();
		c.add(12.5);//Auto boxing
//		double d=a.get(0); Not have get mathode as INdexing is absent in set 
		c.add(10.4);
		c.add(6.4);
		System.out.println(c);
		System.out.println("________________________________________________________");
		TreeSet<Double>d=new TreeSet<>();
		d.addAll(c);
		System.out.println(d);//As hash tree has a sorted order property
		System.out.println("________________________________________________________");
		ArrayList<String>a3=new ArrayList<>();
				a3.add("Akash");
				a3.add("Pradhan");
				a3.add("Alankrita");
				a3.add("Anuska");
//				For Each foop
				for(String i:a3) {
					System.out.println(i+"\t"+i.length());
				}
				for(String i:a3) {
					StringBuffer temp=new StringBuffer(i);
					System.out.println(temp.reverse());
					
				}
		System.out.println("________________________________________________________");		
//		Iterator Forward traverse
		Iterator<String>a=a3.iterator();
		while(a.hasNext()) {
			String next=a.next();
			System.out.println(next);
		}
		System.out.println("________________________________________________________");
		Iterator<String >r=a3.iterator();
		while(r.hasNext()) {
			String m=r.next();
			System.out.println(m);
		}
		System.out.println("________________________________________________________");
//		ListIterator Both Forword and BackWord Traverse
		ListIterator<String>m=a3.listIterator();//Forword
		while(m.hasNext()) {
			String k=m.next();
			System.out.println(k);
		}
		System.out.println("________________________________________________________");
		ListIterator<String> m2=a3.listIterator(a3.size());//Backword Traverse
		while(m2.hasPrevious()) {
			String h=m2.previous();
			System.out.println(h);
		}
		System.out.println("________________________________________________________");
//		forEach function
		a3.forEach(i->{
			System.out.println(i);
		});
		System.out.println("________________________________________________________");
		arr.forEach(r2->{
			System.out.println(r2);
		});
	}

}
