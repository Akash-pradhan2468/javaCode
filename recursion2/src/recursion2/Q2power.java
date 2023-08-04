package recursion2;

public class Q2power {
public static int power(int a,int b) {
	if(b==0) {
		return 1;
	}
	
	return a*power(a, b-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(3,3));
	}

}
