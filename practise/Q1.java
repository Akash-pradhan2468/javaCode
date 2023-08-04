package practise;
import java.util.*;
public class Q1 {
public static <m>void printArr(m a[]){
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Integer intarr[]=new Integer[5];
System.out.println("Enter array elements");
for(int i=0;i<intarr.length;i++)
	intarr[i]=sc.nextInt();
printArr(intarr);
	}

}
