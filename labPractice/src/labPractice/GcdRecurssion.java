package labPractice;

public class GcdRecurssion {
public static int findGcd(int a,int b) {
	if(b%a==0)
		return a;
	else
		return findGcd(b, b%a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findGcd(2, 12));
System.out.println(findGcd(9, 27));
System.out.println(findGcd(8, 12));

	}

}
