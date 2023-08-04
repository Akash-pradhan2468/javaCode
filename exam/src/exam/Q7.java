package exam;

public class Q7 {
public static int findGvd(int a,int b) {
	if(b%a==0)
		return a;
	else 
		return findGvd(b, b%a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
