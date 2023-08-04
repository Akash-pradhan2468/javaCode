import java.util.Arrays;

public class Linear_search {
	
	
public static boolean Lsearch(int arr[],int x) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			return true;
			
		}
	}
	return false;
}
public static boolean Binary_search(int arr[],int st,int end,int x) {
//	Base case
	if(st>=end) {
		return false;
	}else {
	int mid=(st+end)/2;
	if(arr[mid]==x) {
		return true;
	}else if(x>arr[mid]) {
		Binary_search(arr, mid+1, end, x);
	}else {
		Binary_search(arr, st, mid-1, x);
	}
	}
	return false;
}
	public static void main(String[]args) {
		int arr[]= {5,8,7,6,5,9,2,4};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println(Lsearch(arr, 11));
		System.out.println(Binary_search(arr, 0, arr.length-1, 6));
	
		
		
	
		
	}
	
	
	
	
}
