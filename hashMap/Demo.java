package hashMap;
import java.util.HashMap;
import java.util.Set;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer>a=new HashMap<>();
//PUT is used to insert
a.put("abc", 1);
a.put("abc1", 2);
//CointainsKey is Used cheack whether hashmap contans the key or not
System.out.println(a.containsKey("abc"));
System.out.println(a.containsKey("abc3"));
// get is used to fatch the object by key and return the value 
int v1=a.get("abc");
System.out.println(v1);
//int v2=a.get("abc3");
// as abc3 is not present so get methode return null so when int v2=null it gives null pointer exception
int v2=0;
if(a.containsKey("abc3")) {
	v2=a.get("abc3");
}
System.out.println(v2);
//This is the write way to call get function after chacking containskey 
a.put("def", 3);
//Iterate
Set<String> allKeys=a.keySet();
for(String s:allKeys) {
	System.out.println(s);
}
//first collect all keys in a set class by the function keySet after that
//using enhance for loop we can iterate on all keys
System.out.println(a.size());
//size function return the size
System.out.println(a.containsValue(2));
//it search wheather the hashMap have the value or not
//containsKey is O(1)
//containsValue is O(n)
	}

}
