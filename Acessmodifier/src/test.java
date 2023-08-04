class xyz{
	private int a1;
	int a2;
	protected int a3;
	public int a4;
	xyz(){
		a1=10;
		a2=20;
		a3=30;
		a4=40;
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
xyz obj =new xyz();
//System.out.println(obj.a1);
System.out.println(obj.a2);
System.out.println(obj.a3);
System.out.println(obj.a4);
	}

}
