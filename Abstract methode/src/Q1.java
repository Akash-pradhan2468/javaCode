abstract class animal{
	 abstract void animalsound(); 
	 void sleep() {
		 System.out.println("i am sleeping");
	 }
}
class pigoo extends animal{
	  void animalsound() {
		System.out.println("i am a gog");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pigoo a=new pigoo();
		a.animalsound();
		a.sleep();
	}

}
