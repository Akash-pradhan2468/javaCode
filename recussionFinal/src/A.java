
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>list=new ArrayList<>();
//Array contineous memory 
//ArrayList Discontineous memory
//Array store primitive dataType as well as Objects
//ArrayList stores only Object
//Integer,String,Float are the class

ArrayList<String> List2=new ArrayList<String>();

//Add element

	list.add(1);
	list.add(6);
	list.add(9);
	list.add(7);
	
//	Print whole arratList
	
	System.out.println(list);
	
//	get indivisual element
	
	System.out.println(list.get(2));
	System.out.println(list.get(3));
	
//	Add inbetween
	
	list.add(2,54);
	System.out.println(list);
	
//	Set function that is change the element
	list.set(1, 78);
	System.out.println(list);
	
//	remove element
	list.remove(2);
	System.out.println(list);
	
//	size
	System.out.println(list.size());
//	Loop use
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	
//	short
	
	Collections.sort(list);
	System.out.println(list);
	
	
	}

}
