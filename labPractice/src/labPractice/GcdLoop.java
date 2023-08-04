package labPractice;

public class GcdLoop {
public static int findGCD(int x,int y) {
	int k=Math.min(x, y);
	while(k>0) {
		if(x%k==0&&y%k==0)
			break;
		k--;
	}
	return k;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findGCD(12, 16));
System.out.println(findGCD(12, 60));
	}

}
