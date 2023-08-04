package assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.beans.DesignMode;
import java.util.Collections;

public class Quesation {
public static boolean isPrime(int n) {
	if(n==1) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
	 return true;
}

public static void DecimalToBinary(int n) {
	if(n==0) {
		System.out.println(0);
	}
	String s="";
	while(n!=0) {
			s=n%2+s;
			n=n/2;
	}
	System.out.println(s);
}

public static  long reversedigit(long n)
{
    long ans=0;
    while(n!=0) {
    	long temp=n%10;
    	ans=ans*10+temp;
    	n=n/10;
    }
    return ans;
}
public static int binarysearch(int arr[], int st,int end, int k) {
    // code here
	if(st>end) {
		return -1;
	}
	int mid=st+((end-st)/2);
	if(arr[mid]==k) {
		return mid;
	}else if(k>arr[mid]) {
		return binarysearch(arr, mid+1, end, k);
	}else {
		return binarysearch(arr, st, mid-1, k);
	}
}
public static void reversearr(int arr[],int st,int end) {
	while(st<end) {
		int temp=arr[st];
		arr[st]=arr[end];
		arr[end]=temp;
		st++;
		end--;
	}
}
public static void reverseKelement(int arr[],int k) {
	reversearr(arr, 0, arr.length-1);
	reversearr(arr, 0, arr.length-k-1);
	reversearr(arr, k, arr.length-k);
}
public static void print(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public static long maximumSubarray(int arr[]) {
	int sum=0;
	int maxSum=0;
	for(int i=0;i<arr.length;i++){
		sum=sum+arr[i];
		if(sum<0) {
			sum=0;
		}else {
			if(sum>maxSum) {
				maxSum=sum;
			}
		}	
	}
	if(maxSum==0) {
		maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxSum) {
				maxSum=arr[i];
			}
		}
	}
	return maxSum;
}
public static void waveform(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		if(i%2==0) {
			if(arr[i]<arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}else {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
}
public static void indexArray(int arr[]) {
	int arr2[]=new int[arr.length];
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=-1;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==-1) {
			continue;
		}else {
		arr2[arr[i]]=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr2[i];
	}   
}
public static int smallestPosiveElement(int arr[]) {
	HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

for(int i=0;i<arr.length;i++) {
	hs.put(arr[i], 1);
}
for(int i=1;i<arr.length;i++) {
	if(hs.containsKey(i)==false) {
		return i;
	}
}
return -1;
	
}
public static void maxMinArray(int arr[]) {
	int st=0;
	int end=arr.length-1;
	int i=0;
	int arr2[]=new int[arr.length];
	while(st<=end) {
		if(i%2==0) {
			arr2[i]=arr[end];
			i++;
			end--;
		}else {
			arr2[i]=arr[st];
			st++;
			i++;
		}
	}
	for(int j=0;j<arr.length;j++) {
		arr[j]=arr2[j];
	}
}
public static int maximumsumOfRoatedArray(int arr[]) {
int sum=0;
int finalans=0;
	for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
 }
int s1=0;
int s=0;
for(int i=0;i<arr.length;i++) {
	s1=s1+arr[i]*i;
}
 finalans=s1;
for(int i=1;i<arr.length;i++) {
	s=s1-sum+(arr[i-1]*arr.length);// s=s'-c+arr[i-1]*n is the formula
	if(s>finalans) {
		finalans=s;
	}
	s1=s;
}
return finalans;
}
public static int maxDifference(int arr[]) {
//	THIS CODE GIVE WRONG OUTPUT
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		hm.put(arr[i], i);
	}
	Arrays.sort(arr);
	int maxdiff=0;
	int st=0;
	int end=arr.length-1;
	while(st<end) {
		int i=hm.get(arr[st]);
		int j=hm.get(arr[end]);
		if(j>i&&j-i>maxdiff) {
			maxdiff=j-1;
		}
		st++;
		end--;
	}
	return maxdiff;
}
public static void towerOfHanoi(int n,String s,String h,String d) {
//	Base case
	if(n==1) {
		System.out.println("Moov "+n+" th disk from "+s+" to "+d);
		return;
	}
//recursive call
	towerOfHanoi(n-1, s, d, h);
//	Work that i have to do
	System.out.println("Moov "+n+" th disk from "+s+" to "+d);
//	recrsive call
	towerOfHanoi(n-1, h, s, d);
}
public static int gcd(int a,int b) {
	if(b==0) {
		return a;
	}
	if(b>a) {
		 gcd(b,a);
	}
	return gcd(b,a%b);
	
}
public static void permutationOnIntegerList(int arr[],int j,String s) {
	
	if(j==arr.length-1) {
		System.out.println(s);
	}
	s=s+arr[j];
	permutationOnIntegerList(arr,j+1, s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stubf
//   DecimalToBinary(8);
// long m=  reversedigit(23);
// System.out.println(m);
// int arr[]= {40 ,13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65,25};
// reverseKelement(arr, 69);
// print(arr);
// int arr2[]= {-1,-2,-3,-4};
//System.out.println(maximumSubarray(arr2));
// int arr3[]= {1,2,3,4,5,6,7};
// int arr4[]= {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};

// waveform(arr3);
// indexArray(arr4);
// print(arr4);
// int[] arr5 = {8, 5, 6, 1, 9, 11, 2, 7, 4, 10};
//int m1= smallestPosiveElement(arr5);
//System.out.println(m1);
// int arr6[]= {1,2,3,4,5,6,7};
// maxMinArray(arr6);
// print(arr6);
// int arr8[]= {8,3,1,2};
// System.out.println(maximumsumOfRoatedArray(arr8));
//		int arr9[]= {34, 8, 10, 3, 2, 80, 30, 33, 1};
//		System.out.println(maxDifference(arr9));
//		towerOfHanoi(3, "S", "H", "D");
//		System.out.println(gcd(8, 3));
		int arr10[]= {1,2,3};
		permutationOnIntegerList(arr10, 0,"");

	}

}
