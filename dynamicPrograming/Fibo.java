package dynamicPrograming;
import java.util.Scanner;
public class Fibo {
public static int computeFibo(int n) {
	if(n==0||n==1) {
		return n;
	}
	int f1=computeFibo(n-1);
	int f2=computeFibo(n-2);
	int ans=f1+f2;
	return ans;
}
public static int fiboDp(int n,int memo[]) {
	if(n==0||n==1) {
		return n;
	}
	int ans1;
	int ans2;
	if(memo[n-1]!=-1) {
		ans1=memo[n-1];
	}else {
		ans1=fiboDp(n-1, memo);
		memo[n-1]=ans1;
	}
	
	if(memo[n-2]!=-1) {
		ans2=memo[n-2];
	}else {
		ans2=fiboDp(n-2, memo);
		memo[n-2]=ans2;
	}
	int ans=ans1+ans2;
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the position of fibunachi number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(computeFibo(a));
int arr[]=new int[a+1];
for(int i=0;i<arr.length;i++) {
	arr[i]=-1;
}
System.out.println(fiboDp(a, arr));
	}

}
