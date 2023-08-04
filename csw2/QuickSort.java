package csw2;

public class QuickSort {
	public static int partisonget(int arr[],int low,int heigh) {
		int pivot=arr[low];
		for(int i=low-1,j=heigh;i<j;) {
			if(arr[i]<pivot) {
				
			}
		}
	}
public static void quicksort(int arr[],int low,int heigh) {
	int partision=partisonget(arr,low,heigh);
	quicksort(arr,low,partision-1);
	quicksort(arr, partision+1, heigh);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
