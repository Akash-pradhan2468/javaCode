package csw2;

import java.net.http.WebSocket;

public class BucketShort {
public static void bshort(int arr[],int low,int heigh) {
	int count[]=new int [heigh-low];
	for(int i=0;i<arr.length;i++) {
		count[arr[i]-low]++;
	}
	int j=0;
	for(int i=0;i<count.length;i++) {
		for(;count[i]>0;count[i]--) {
			arr[j]=i+low;
			j++;
		}
	}
}
public static void printarr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,4,5,11,9,8};
		bshort(arr, 0, 15);
		printarr(arr);
	}

}
