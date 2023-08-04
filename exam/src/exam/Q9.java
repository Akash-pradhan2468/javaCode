package exam;

public class Q9 {
public static int arrsum(int arr[],int k) {
	
	if(k<0)
		return 0;
	else
		return arr[k]+arrsum(arr,k-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4};
int a=arrsum(arr, arr.length-1);
System.out.println(a);
	}

}
