class wast{
private int a11=10;	
 int a12=20;	
protected int a13=30;	
public int a14=40;	
void acessprivate() {
	System.out.println(a11);
}
	
	
}
public class Q1  extends wast{
private int a1=10;//INSTANCE VARIABLE
int a2=20;//INSTANCE VARIABLE
protected int a3=30;//INSTANCE VARIABLE
public int a4=40;//INSTANCE VARIABLE
int a5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 obj=new Q1();
//		//LOCAL VARIABLE
//System.out.println(obj.a1);
//System.out.println(obj.a2);
//System.out.println(obj.a3);
//System.out.println(obj.a4);
//System.out.println(a1);
		//System.out.println(obj.a11);
		System.out.println(obj.a12);
		System.out.println(obj.a13);
		System.out.println(obj.a14);
		//System.out.println(obj.a11);
		obj.a5=98;
	
		int a2=21;
		obj.acessprivate();
	System.out.println(a2);

	}

}
