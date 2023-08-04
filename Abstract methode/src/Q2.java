import java.util.Scanner;
class n{
	int x;
	void display() {
		System.out.println("this refer to "+this.x);
	}
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		this.display();
	}
}
public class Q2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
n obj=new n();
obj.getData();

	}

}
