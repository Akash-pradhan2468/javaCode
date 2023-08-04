package exam;
interface tapu{
	int x=10;
	public void print();
}
class akash implements tapu{
	public void print() {
		System.out.println("TApu");
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
akash obj=new akash();
obj.print();
	}

}
