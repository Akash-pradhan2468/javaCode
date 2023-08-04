package labPractice;

public class IsprimeLoop {
public static boolean isPrime(int x) {
	if(x<=1)
		return false;
	for(int i=2;i<=Math.sqrt(x);i++) {
		if(x%i==0)
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPrime(13));
System.out.println(isPrime(4));
System.out.println(isPrime(2));
System.out.println(isPrime(1));
	}

}
