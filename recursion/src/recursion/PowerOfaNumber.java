package recursion;

public class PowerOfaNumber {
public static int powerOfaNumber(int a,int y) {
	if(y==0) {
		return 1;
	}
	if(a==0) {
		return 0;
	}
	int ans=a*powerOfaNumber(a, y-1);
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2;
int pow=5;
int ans=powerOfaNumber(a, pow);
System.out.println(ans);
	}

}
