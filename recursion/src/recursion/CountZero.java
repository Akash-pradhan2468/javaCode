package recursion;

public class CountZero {
public static int Count(int n) {
	if(n==0) {
		return 0;
	}
	int num=n%10;
	if(num==0) {
		return 1+Count(n/10);
	}else {
		return Count(n/10);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
System.out.println(Count(a));
	}

}
