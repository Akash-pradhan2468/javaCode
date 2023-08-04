
public class selectionShort {
	
public static void selectionShort(int a[]) {
	for(int i=0;i<a.length-1;i++) {
		int min=a[0];
		int minidx=i;
		int small2=0;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<min) {
				min=a[j];
				minidx=j;
			}
		}
		int temp=a[i];
		a[i]=a[minidx];
		a[minidx]=temp;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,35,76,2};
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
selectionShort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
	}

}
