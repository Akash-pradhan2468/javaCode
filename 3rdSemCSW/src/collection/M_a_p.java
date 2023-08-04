package collection;
import java.util.*;
public class M_a_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<Key,Value>a=new HashMap<>();
		HashMap<String,Integer>a=new HashMap<>();
		a.put("Akash", 1);
		a.put("Akash1", 2);
		a.put("Akash1", 3);//Douplicate Key values are not possible
		a.put("Akash", 5);
		a.put("Akash3", 5);//douplicate values can be possible
		a.put("Akash7", 9);
		System.out.println(a);
		a.forEach((e1,e2)->{
			System.out.println(e1+"--->>"+e2);
		});
	}

}
