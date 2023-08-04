package recursion;

public class Factorial {
public static int calculateFactorial(int a) {
	if(a==0) {
		return 1;
	}else {
	return a*calculateFactorial(a-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans=calculateFactorial(6);
System.out.println(ans);
	}

}
