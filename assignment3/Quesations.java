package assignment3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Quesations {
public static int swapzeroone(int arr[]) {
	int st=0;
	int end=arr.length-1;
	int count=0;
	while(st<end) {
		if(arr[st]==0) {
			st++;
		}
		else if(arr[end]==1) {
			end--;
		}else {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			count++;
		}
		
	}
	return count;
}
public static void swapZeroOneTwo(int arr[]) {
	int st=0;
	int end=arr.length-1;
	int k=0;
	while(k<=end) {
		if(arr[k]==0) {
			int temp=arr[k];
			arr[k]=arr[st];
			arr[st]=temp;
			st++;
			k++;
		}else if(arr[k]==2) {
			int temp=arr[k];
			arr[k]=arr[end];
			arr[end]=temp;
			end--;
		}else {
			k++;
		}
//		print(arr);
//		System.out.println("st== "+st);
//		System.out.println("end== "+end);
//		System.out.println("k== "+k);
		
	}
}
public static void separateMaxMintoavalue(int arr[],int k) {
	int st=0;
	int end=arr.length-1;
	int c=0;
	int temp=0;
	while(st<end) {
	if(arr[st]<=k) {
		st++;
	}else if(arr[end]>k) {
		end--;
	}else {
		 temp=arr[st];
		arr[st]=arr[end];
		arr[end]=temp;
		st++;
		end--;
		c++;
	}
	}
	System.out.println(c);
}
public static int minmumToKTogegetherMinSwap(int arr[],int k) {
	int Tfavo=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<=k)Tfavo++;
	}
	int ans=0;
	int unfavorable=0;
	for(int i=0;i<Tfavo;i++) {
		if(arr[i]>k) {
			unfavorable++;
		}
		ans=unfavorable;
	}
	int l=1;
	int h=Tfavo;
	while(h<arr.length) {
		if(arr[l-1]>k) {
			unfavorable--;
		}
		if(arr[h]>k) {
			unfavorable++;
		}
		if(unfavorable<ans) {
			ans=unfavorable;
		}
		h++;
		l++;
	}
	return ans;
}
public static int[] sortA1ByA2(int A1[],int A2[])
{
    //Your code here
    Arrays.sort(A1);
    HashMap<Integer,Integer>hm=new HashMap<>();   
    for(int i=0;i<A1.length;i++) {
    	if(hm.containsKey(A1[i])) {
    		hm.put(A1[i], hm.get(A1[i])+1);
    	}else {
    		hm.put(A1[i], 1);
    	}
    }
    int arr[]=new int[A1.length];
    int k=0;
    for(int i=0;i<A2.length;i++) {
    	if(hm.containsKey(A2[i])) {
    		int a=hm.get(A2[i]);
    		for(int j=0;j<a;j++) {
    			arr[k]=A2[i];
    			k++;
    		}
    		hm.remove(A2[i]);
//    		print(arr);
    	}
    }
    for(int i=0;i<A1.length;i++) {
    	if(hm.containsKey(A1[i])) {
    		int a=hm.get(A1[i]);
    		for(int j=0;j<a;j++) {
    			arr[k]=A1[i];
    			k++;
    		}
    		hm.remove(A1[i]);
//    		print(arr);
    		}
    }
    return arr;
}
public static  void segregateEvenOdd(int arr[], int n) {
    // code here
	int st=0;
	int end=arr.length-1;
	while(st<end) {
		if(arr[st]%2==0) {
			st++;
		}else if(arr[end]%2==1) {
			end--;
		}else {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
			
		}
	}
	print(arr);
	Arrays.sort(arr,0,st);
	Arrays.sort(arr,st,arr.length);
	
}
public static void print(int arr[]) {
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}public static void AR(int arr[]) {
	Arrays.sort(arr);
	int i=0;
	int nonZero=0;
while(nonZero!=0) {
	int a=0;
	int min=0;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]!=0) {
			min=j;
			break;
		}
	}
	while(i<arr.length) {
		arr[i]=arr[i]-min;
		if(arr[i]!=0) {
			a++;
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println();
	nonZero=a;
	}
}
	public static void SortedTwoarray(int arr1[],int arr2[]) {
	Arrays.sort(arr1);	
	Arrays.sort(arr2);
	int i=0;
	while(i<arr1.length) {
		if(arr1[i]<arr2[0]) {
			i++;
		}else {
			int temp=arr1[i];
			arr1[i]=arr2[0];
			arr2[0]=temp;
			Arrays.sort(arr2);
			i++;
		}
	}
	}
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
    	HashMap<Integer,Integer>hm=new HashMap<>();
    	for(int i=0;i<a.length;i++) {
    			hm.put(a[i], 1);
    	}
    	int c=0;
    	for(int i=0;i<b.length;i++) {
    		if(hm.containsKey(b[i])) {
    			hm.remove(b[i]);
    			c++;
    		}
    	}
    	return c;
    	
    	
    }
	public static void union(int arr1[],int arr2[]) {
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			hm.put(arr1[i], 1);
		}
		for(int i=0;i<arr2.length;i++) {
			hm.put(arr2[i], 1);
		}
		Set<Integer>a;
		a=hm.keySet();
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {0,0,1,0,1,1,0};
//System.out.println(swapzeroone(arr));
//print(arr);
//int arr2[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//swapZeroOneTwo(arr2);
//print(arr2);
//int arr3[]= {10, 12 ,20 ,20 ,5 ,19 ,19 ,12 ,1 ,20 ,1};
//System.out.println(minmumToKTogegetherMinSwap(arr3, 11));
//print(arr3);
//		int arr4[]= {2,1,2,5,7,1,9,3,6,8,8};
//		int arr5[]= {2,1,8,3};
//		int arr[]=sortA1ByA2(arr4, arr5);
//		print(arr);
//		int arr6[]= {12, 34, 45, 9 ,8 ,90, 3};
//		segregateEvenOdd(arr6, arr6.length);
//		print(arr6);
//		int arr[]= {6,5,4,3,2,1};
//		Arrays.sort(arr,0,3);
//		print(arr);
//		int arr7[]={ 5, 1, 1, 1, 2, 3, 5 };
//		AR(arr7);
//		int arr1[] = { 1, 5, 9, 10, 15, 20 };
//		int arr2[] = { 2, 3, 8, 13 };
//		SortedTwoarray(arr1, arr2);
//		print(arr1);
//		print(arr2);
		int a[] = {1,2, 2, 3, 4, 5, 6};
		int b[] = {3, 4,2,2, 5, 6, 7};
		System.out.println(NumberofElementsInIntersection(a, b, a.length, b.length));
		union(a, b);
		
	}

}
