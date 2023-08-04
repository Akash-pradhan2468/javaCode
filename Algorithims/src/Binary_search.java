import java.util.Arrays;

public class Binary_search {
public static boolean Bsearc(int arr[],int st,int end,int x) {
	if(st<=end) {
		int mid=(st+end)/2;
		if(arr[mid]==x) {
			return true;
		}
		if(x>arr[mid]) {
			return Bsearc(arr, mid+1, end, x);
		}else {
			return Bsearc(arr, st, mid-1, x);
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,6,4,6,7,8,6,1};
Arrays.sort(arr);
System.out.println(Bsearc(arr, 0, arr.length-1, 8));

	}

}
