package area;

public class Q1 {
public static int findMin(int arr[],int st,int end) {
//	first find mid
	int mid=(st+end)/2;
//	find if min is present at mid then return
	if(arr[mid]<=arr[mid-1]&&arr[mid]<=arr[mid+1]) {
		return mid;
	}
//	if min is present at left side then call findmin with st=0 and end=min-1
	if(arr[mid]>=arr[mid-1]&&arr[mid]<=arr[mid+1]) {
		return findMin(arr, st, mid-1);
	}
//	if min is present at right side then call findmin st=0,end=mid-1
	if(arr[mid]<=arr[mid-1]&&arr[mid]>=arr[mid+1]) {
		return findMin(arr, mid+1, end);
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {9,8,7,6,1,2,3,5,6,8};
System.out.println(arr1[findMin(arr1, 0, arr1.length-1)]);
int arr2[]= {23,20,14,8,34,45,67};
System.out.println(arr2[findMin(arr2, 0, arr2.length-1)]);

	}

}
