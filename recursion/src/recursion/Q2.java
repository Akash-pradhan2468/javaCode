package recursion;
class a{
	a(int c){
		System.out.println("AKash"+c);
	}
}
class b extends a{
	 b(){
		 super(10);
		 System.out.println("obj of b is created");
	 }
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b obj=new b();

	}

}
