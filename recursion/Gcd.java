package recursion;

public class Gcd {
public static int findgcd(int a,int b) {
	if(b==0) {
		return a;
	}else {
		return findgcd(b,a%b);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int gcd=findgcd(16, 12);
	System.out.println(gcd);
}

}
