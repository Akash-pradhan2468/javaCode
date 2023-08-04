package nineQuesation;

public class towerOfHania {
public static void tower(int n,String src,String helper,String des ) {
	if(n==1) {
		System.out.println("Transfer disk"+n+"From"+src+"To"+des);
	}
	tower(n-1,src,des,helper);
	System.out.println("Tranfer "+n+"from"+src+"To"+des);
	tower(n-1,helper,des,src);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
tower(n,"S","H","D");
	}

}
