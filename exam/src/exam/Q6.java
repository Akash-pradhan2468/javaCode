package exam;

public class Q6 {
public static <t> int count(t arr[],t a) {
	int k=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].equals(a)) {
			k++;
		}
	}
	return k;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer arr[]= {1,3,4,5,6,2,3};
int a=count(arr, 3);
System.out.println(a);
Character arr1[]= {'a','f','t','a'};
int m=count(arr1, 'a');
System.out.println(m);
	}

}
