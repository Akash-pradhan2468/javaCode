package searching_shorting;
import java.util.Scanner;
public class Linear_search {
public static void linearSearch(int a[],int x) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==x) {
			System.out.println("Your searched number is presennt at index "+i);
			return;
		}
	}
	System.out.println("Not in Array");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {24,2,8,9,56,48,75,32,23};
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number that you want to search");
int x=sc.nextInt();
linearSearch(arr, x);

	}

}
