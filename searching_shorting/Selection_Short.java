package searching_shorting;
import java.util.Arrays;
public class Selection_Short {
	public static void print(int a[]){
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void selectionShort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int smallest=a[i];
			int index=i;
			for(int j=i;j<=a.length-1;j++) {
			if(a[j]<smallest) {
				smallest=a[j];
				index=j;
			}
			}
			//swap
			int k=a[i];
			a[i]=smallest;
			a[index]=k;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {56,76,98,99,34,24,12,77,65,2};
System.out.println("Before short");
print(arr);
selectionShort(arr);
System.out.println("After short");
print(arr);
System.err.print(10);

	}

}
