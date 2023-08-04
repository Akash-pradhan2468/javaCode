package recursion;

public class GeometricSum {
public static double Gsum(int k) {
	if(k<0) {
		return 0;
	}
	return (1/(Math.pow(2, k)))+Gsum(k-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=4;
System.out.println(Gsum(a));
	}

}
