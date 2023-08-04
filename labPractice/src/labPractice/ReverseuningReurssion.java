package labPractice;

public class ReverseuningReurssion {
public static void findReverse(int x) {
	if(x%10==0) {
		return ;
	}else {
		System.out.print(x%10);
		findReverse(x/10);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
findReverse(123);
System.out.println();
	}

}
