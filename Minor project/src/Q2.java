import java.util.Scanner;
class point{
	double x;
	double y;
	void setPoint(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X coardinate of the point");
		double a=sc.nextInt();
		x=a;
		System.out.println("Enter the Y coardinate of the point");
		double b=sc.nextInt();
		y=b;
	}
	void showPoint() {
		System.out.println("coardinate of the point is "+x+","+y);
	}
	double findDistance(point a,point b) {
	  double e=Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2);
		double f=Math.pow(e, 0.5);	
		return f;
	}
}
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
point k=new point();
point j=new point();
k.setPoint();
j.setPoint();
k.showPoint();
j.showPoint();
System.out.println("Distance between the points is "+k.findDistance(k, j));

	}

}
