package exam;
abstract class animal{
	public abstract void animalsound();
	public void speep() {
		System.out.println("Animal is sleeping");
	}
}
class pig extends animal{
	public void animalsound() {
		System.out.println("tapu");
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pig obj=new pig();
obj.animalsound();
obj.speep();
	}

}
