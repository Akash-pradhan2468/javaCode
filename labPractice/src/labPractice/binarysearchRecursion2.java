package labPractice;

public class binarysearchRecursion2 {
public static boolean search(int arr[],int x,int st,int end) {
if(st<=end) {
int mid=(st+end)/2;
if(x==arr[mid]) {
	return true;
	}else if(x>arr[mid]) {
		return search(arr, x, st+1, end);
	}else {
		return search(arr, x, st, end-1);
				}
 }else {
	 return false;
 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,6,7,9};
System.out.println(search(arr, 10,0,arr.length-1));
	
}
}
