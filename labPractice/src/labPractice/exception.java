package labPractice;

public class exception {
public static void salary(int x) {
	if(x<1000) {
		throw new ArithmeticException("Poor salary");
	}else {
		System.out.println("Good salary"); 
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	salary(800);
}
catch(ArithmeticException e){
	System.out.println(e);
}
	}

}
