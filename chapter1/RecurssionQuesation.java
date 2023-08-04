package chapter1;

public class RecurssionQuesation {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static String DecimalToBinary(int a,String ans) {

		if(a<=1) {
			ans=a+ans;
			return ans;
		}
		return DecimalToBinary(a/2,a%2+ans);

		
		
	}
	public static void toBinary(int N) {
		if(N==0) {
			System.out.println(0);
		}
		String s="";
		while(N>0) {
			s=N%2+s;
			N=N/2;
		}
		System.out.println(s);
	}
	public static void towerofhenoie(int n,String s,String h, String d) {
//		BAse case
		if(n==1) {
			System.out.println("Moov disk from "+s+" to "+d);
			return;
		}
		towerofhenoie(n-1, s, d, h);
		System.out.println("moov disk from "+s+" to "+d);
		towerofhenoie(n-1, h, s, d);
	}
	public static void gcd(int m,int n) {
		if(m<n) {
			gcd(n,m);
			return;
		}
		if(m%n==0) {
			System.out.println("GCD is "+ n);
		}else {
	    gcd(n,m%n);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(factorial(5));
String a=DecimalToBinary(1,"");
System.out.println(a);
//System.out.println("A"+1);
toBinary(3);
towerofhenoie(3,"A","B","C");
gcd(6, 8);
	}

}
