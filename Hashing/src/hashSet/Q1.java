package hashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>set=new HashSet<>();
//Adding element in hash set
set.add(2);
set.add(1);
set.add(3);
set.add(2);
//Searching element in hash set contains
if(set.contains(1)) {
	System.out.println("yes");
}
if(!set.contains(6)) {
	System.out.println("no");
}
//print hash set
System.out.println(set);
//Delete
set.remove(3);
System.out.println(set);
//size of hashset
System.out.println(set.size());
set.add(65);
Iterator it=set.iterator();

while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
