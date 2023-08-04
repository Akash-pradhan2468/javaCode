package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicate {
public static ArrayList<Integer> removeDuplicate(int arr[]){
	HashMap<Integer,Boolean>hm=new HashMap<>();
	ArrayList<Integer>output=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		if(!hm.containsKey(arr[i])) {
			output.add(arr[i]);
			hm.put(arr[i], true);
		}
	}
	return output;
	
}
public static int maxFrequencyNumber(int[] arr){ 
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i], hm.get(arr[i])+1);
		}else {
			hm.put(arr[i], 1);
		}
	}
	int a=0;
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		if(hm.get(arr[i])>a) {
			a=hm.get(arr[i]);
			ans=arr[i];
		}
	}
	return ans;
}
public static void printIntersection(int[] arr1,int[] arr2){
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr1.length;i++) {
		hm.put(arr1[i],1);
	}
	for(int i=0;i<arr2.length;i++) {
		if(hm.containsKey(arr2[i])) {
			System.out.println(arr2[i]);
		}
	}

}
public static int PairSum(int[] input, int size) {
	//In this methode we have to travrse the array 2 times and it gives output wrong for the input 00000
//	it gives 25 but the combination will be 10
HashMap<Integer,Integer>hm=new HashMap<>();
for(int i=0;i<input.length;i++) {
	if(hm.containsKey(input[i])) {
		hm.put(input[i], hm.get(input[i])+1);
	}else {
		hm.put(input[i],1);
	}
}
int count=0;
for(int i=0;i<input.length;i++) {
	if(hm.containsKey(0-input[i])) {
		count=count+hm.get(input[i])*hm.get(0-input[i]);
		hm.put(input[i],0);
		hm.put(0-input[i],0);
	}
}
return count;

}
public static int PairSum2(int[] input, int size) {
	int count=0;
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<input.length;i++) {
		if(hm.containsKey(0-input[i])) {
			count=count+hm.get(0-input[i]);
		}
		if(hm.containsKey(input[i])) {
			hm.put(input[i],hm.get(input[i])+1);
		}else {
			hm.put(input[i], 1);
		}
	}
	return count;
}
public static String uniqueChar(String str){
HashMap<Character,Integer>a=new HashMap<>();
String ans="";
for(int i=0;i<str.length();i++) {
	char b=str.charAt(i);
	if(!a.containsKey(b)) {
		ans=ans+b;
		a.put(b, 1);
	}
}
	return ans;

}
public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
HashMap<Integer,Integer>hm=new HashMap<>();
for(int i=0;i<arr.length;i++) {
	hm.put(arr[i], 1);
	int a=0;
	int b=0
	int size=0;
	
}
}

public static int getPairsWithDifferenceK(int arr[], int k) {
	//Write your code here
	HashMap<Integer,Integer>hm=new HashMap<>();
for(int i=0;i<arr.length;i++) {
	if(hm.containsKey(arr[i])) {
		hm.put(arr[i], hm.get(arr[i])+1);
	}else {
		hm.put(arr[i], 1);
	}
}
int c=0;
for(int i=0;i<hm.size();i++) {
	if(hm.containsKey(arr[i]+k)) {
		c=c+(hm.get(arr[i])*hm.get(arr[i]+k));
	}
	if(hm.containsKey(arr[i]-k)) {
		c=c+(hm.get(arr[i])*hm.get(arr[i]-k));
	}
	hm.remove(arr[i]);
}
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,2,4,5,6,7,6,9};
ArrayList<Integer>output=removeDuplicate(arr);
System.out.println(output);
int arr1[]= {1,2,3,4,5};
int arr2[]= {2,3,4};
printIntersection(arr1, arr2);
int arr3[]= {1,2,3,-2,2,5};
System.out.println("Bhosdike");
System.out.println(PairSum(arr3, arr3.length));
int arr4[]= {0,0,0,0,0};
System.out.println(PairSum2(arr4, arr.length));
System.out.println(427%26);
String a="aabbccddeeff";
System.out.println(uniqueChar("aabbccddeeffggs"));
	}

}
