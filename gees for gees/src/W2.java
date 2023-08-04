class shape{
	String color;
}
class triangle extends shape{
	int area;
}
class equtriangle extends triangle{
	int perimeter;
}
public class W2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	equtriangle a=new equtriangle();
	a.color="black";
	a.area=100;
	a.perimeter=89;
	System.out.println(a.color);
	System.out.println(a.area);
	System.out.println(a.perimeter);
	}

}
