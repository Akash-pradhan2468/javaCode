package dynamicPrograming;

public class NoOfWaysToClimStares {
public static int ways(int n) {
//	base case
	int arr[]=new int[n+1];
	if(n==0||n==1) {
		arr[n]=n;
		return arr[n];
	}else if(n==2) {
		arr[n]=1+ways(n-1);
		return arr[n];
	}else
	

	return ways(n-1)+ways(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ways(4));
	}

}
