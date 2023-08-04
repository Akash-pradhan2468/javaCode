package dynamicPrograming;

public class Fibo2 {
	public static int fiboHelper(int n,int memo[]) {
		if(n==1||n==0) {
			return n;
		}
		if(memo[n]!=-1) {
			return memo[n];
		}
		memo[n]=fiboHelper(n-1,memo)+fiboHelper(n-2,memo);
		return memo[n];
		
	}
	public static int fiboTabulation(int n) {
		int memo[]=new int[n+1];
		memo[0]=0;
		memo[1]=1;
		for(int i=2;i<memo.length;i++) {
			memo[i]=memo[i-1]+memo[i-2];
		}
		return memo[n];
	}
	public static int fiboOptimise(int n) {
		int pre1=0;
		int pre2=1;
		int cur;
		if(n==0) {
			return 0;
		}
		for(int i=2;i<=n;i++) {
			cur=pre1+pre2;
			pre1=pre2;
			pre2=cur;
		}
		return pre2;
	}
public static int fibo(int n) {
	int arr[]=new int[n+1];
	for(int i=0;i<arr.length;i++) {
		arr[i]=-1;
	}
	return fiboHelper(n, arr);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fibo(5));
System.out.println(fiboTabulation(10));
System.out.println(fiboOptimise(0));
	}

}
