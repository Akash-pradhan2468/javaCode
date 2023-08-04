package recursion;

public class PowerOfXwithlogn {
public static int power(int x,int n) {
	if(n==0) {
		return 1;
	}
	if(x==0) {
		return 0;
	}
	
	if(n%2==0) {
		return power(x,n/2)*power(x,n/2);
	}
	else {
		return power(x, n/2)*power(x, n/2)*x;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=2;
int n=5;
int ans=power(2,5);
System.out.println(ans);
	}

}
