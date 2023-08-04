package chapter1;

import java.util.*;
import java.util.Map.Entry;
public class Demo {
	  public static boolean isFrequencyUnique(int n, int[] arr) {
	        // code here
	     HashMap<Integer,Integer>map=new HashMap();
	     for(int i=0;i<arr.length;i++) {
	    	 if(!map.containsKey(arr[i])) {
	    		 map.put(arr[i], 1);
	    	 }else {
	    		 map.put(arr[i], map.get(arr[i])+1);
	    	 }
	     }
//	     int size=0;
//	    HashMap<Integer,Integer>map2=new HashMap<>();
//	    	for(int i=0;i<arr.length;i++) {
//	    		if(!map2.contains(arr[i])) {
//	    		int v=map.get(arr[i]);
//	    		map2.put(v, arr[i]);
//	    		if(size==map2.size()) {
//	    			return false;
//	    		}else {
//	    			size=map2.size();
//	    		}
//	    				}
//	    		
//	    	}
	     for(int i=0;i<arr.length;i++) {
	    	 Integer a=map.get(arr[i]);
	    	 map.remove(arr[i]);
	    	 if(map.containsValue(a)) {
	    		 return false;
	    	 }
	     }
	    return true;
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0, -4, -4, 0, -4, -4, -4, 0, 0};
System.out.println(isFrequencyUnique(4, arr));
//HashMap<Integer,String>hm=new HashMap<>();
//hm.put(1, "Akash");
//hm.put(2, "Sagar");
//hm.put(3,"Banguru");
//hm.put(4, "Akash");
//
//Iterator<Entry<Integer, String>>itr=hm.entrySet().iterator();
//while(itr.hasNext()) {
//	Entry<Integer, String> obj=itr.next();
//	System.out.println(obj.getKey()+"  "+obj.getValue());

//}
HashMap<Integer,Integer>map=new HashMap();
for(int i=0;i<arr.length;i++) {
	 if(!map.containsKey(arr[i])) {
		 map.put(arr[i], 1);
	 }else {
		 map.put(arr[i], map.get(arr[i])+1);
	 }
}
Iterator<Entry<Integer, Integer>>itr=map.entrySet().iterator();
while(itr.hasNext()) {
	Entry<Integer, Integer> obj=itr.next();
	System.out.println(obj.getKey()+"  "+obj.getValue());
	}

	}

}
