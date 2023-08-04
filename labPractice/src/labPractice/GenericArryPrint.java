package labPractice;

public class GenericArryPrint {
public static <e>void print(e arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer arr[]= {2,3,4,5};
print(arr);
Double arr1[]= {1.2,1.3,2.5};
print(arr1);
	}

}
