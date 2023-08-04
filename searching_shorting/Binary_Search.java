package searching_shorting;

public class Binary_Search {
public static void binarySearch(int a[],int x) {
	int start=0;
	int end=a.length-1;
	for(;;) {
		int mid=(start+end)/2;
		if(mid==start||mid==end) {
			if(a[mid]==x) {
				System.out.println(mid);
				return;
			}else {
				System.out.println("Not found in Array");
			}
		}
		if(a[mid]>=x) {
			end=mid-1;
		}else{
			start=mid+1;
					}
		}
	
			
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {8,18,21,45,65,78};
binarySearch(arr, 45);

	}

}
