package labPractice;

public class BinarySearchWithREcursion {
public static int binarrysearch1(int arr[],int x) {
	int st=0;
	int end=arr.length;
	
	while(st<=end) {
		int mid=st+(end-st)/2;
		if(arr[mid]==x) {
			return mid;
		}else if(x>arr[mid]) {
			st=mid+1;
			
			
		}else {
			end =mid-1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,5,6,8};
if(binarrysearch1(arr, 1)>0) {
	System.out.println("Element is in index "+binarrysearch1(arr, 1));
}else {
	System.out.println("Not present ");
}
	}

}
