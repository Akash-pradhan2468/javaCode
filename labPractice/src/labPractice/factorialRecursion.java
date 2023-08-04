package labPractice;

public class factorialRecursion {

public  static int factorial(int x) {
	if(x==1||x==0) {
		return 1;
	}else {
		return x*factorial(x-1);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(5));
	}

}
