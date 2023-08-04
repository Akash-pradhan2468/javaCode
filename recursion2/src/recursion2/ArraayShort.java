package recursion2;

public class ArraayShort {
static boolean isShorted(int arr[],int n) {
	if(n==0||n==1) {
		return true;
	}if(arr[n]<arr[n-1]) {
		return false;
	}
	if(arr[n]>arr[n-1]) {
		return isShorted(arr, n-1);
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,3,6};
System.out.println(isShorted(arr, arr.length-1));
	}

}
