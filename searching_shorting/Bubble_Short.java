package searching_shorting;

public class Bubble_Short {
public static void print(int a[]){
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
public static void bubbleShortIncrising(int a[]) {
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
		if(a[j]>a[j+1]) {
			//swap
			int y=a[j];
			a[j]=a[j+1];
			a[j+1]=y;
		}	
		}
	}
}
public static void bubbleShortDecreasing(int a[]) {
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]<a[j+1]) {
				//swap
				int y=a[j];
				a[j]=a[j+1];
				a[j+1]=y;
			}
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {54,89,65,23,32,19,99,54,56};
System.out.println("Before short");
print(arr);
bubbleShortIncrising(arr);
System.out.println("After short");
print(arr);
bubbleShortDecreasing(arr);
print(arr);

	}

}
