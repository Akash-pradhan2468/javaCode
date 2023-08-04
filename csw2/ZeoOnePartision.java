package csw2;

public class ZeoOnePartision {
public static void partision(int arr[]) {
	int low=0;
	int heigh=arr.length-1;
	while(low<heigh) {
		while(arr[low]==0) {
			low++;
		}
		while(arr[heigh]==2) {
			heigh--;
		}
		if(low<heigh) {
		int temp=arr[low];
		arr[low]=arr[heigh];
		arr[heigh]=temp;
		low++;
		heigh--;
		}
	}
}
public static void ZeroOneTwoPartisoin(int arr[]) {
	int low=0;
	int mid=0;
	int heigh=arr.length-1;
	while(mid<=heigh) {
		if(arr[mid]==0) {
			int temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			low++;
			mid++;
		}else if(arr[mid]==2) {
			int temp=arr[heigh];
			arr[heigh]=arr[mid];
			arr[mid]=temp;
			heigh--;
		}else {
			mid++;
		}
	}
}
public  static void threeWayPartition(int array[], int a, int b)
{
    // code here 
    	int low=0;
int mid=0;
int heigh=array.length-1;
while(mid<=heigh) {
	if(array[mid]<a) {
		int temp=array[low];
		array[low]=array[mid];
		array[mid]=temp;
		low++;
		mid++;
	}else if(array[mid]>b) {
		int temp=array[heigh];
		array[heigh]=array[mid];
		array[mid]=temp;
		heigh--;
	}else {
		mid++;
	}
}
}
public static void print(int arr[]) {
	for(int i:arr) {
		System.out.print(i+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,2,0,2,0,2,2};
int arr2[]= {0,1,0,1,0,2,0,1,1,1,2,2,0};
partision(arr);
for(int i:arr) {
	System.out.print(i+" ");
}
System.out.println();
ZeroOneTwoPartisoin(arr2);
for(int i:arr2) {
	System.out.print(i+" ");
}
System.out.println();
int arr5[]= {1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11};
 threeWayPartition(arr5, 9, 12);
 print(arr5);
 
	}

}
