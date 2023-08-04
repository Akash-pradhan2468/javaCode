import java.util.Scanner;
public class Q8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
System.out.println("a\tb\tpow(a,b)");

int po=(int) Math.pow(a, (a+1));
System.out.println(a+"\t"+(a+1)+"\t "+po);
 po=(int) Math.pow((a+1), (a+2));
System.out.println((a+1)+"\t"+(a+2)+"\t "+po);
po=(int) Math.pow((a+2), (a+3));
System.out.println((a+2)+"\t"+(a+3)+"\t "+po);
po=(int) Math.pow((a+3), (a+4));
System.out.println((a+3)+"\t"+(a+4)+"\t "+po);
po=(int) Math.pow((a+4), (a+5));
System.out.println((a+4)+"\t"+(a+5)+"\t "+po);
po=(int) Math.pow((a+5), (a+6));
System.out.println((a+5)+"\t"+(a+6)+"\t "+po);
po=(int) Math.pow((a+6), (a+7));
System.out.println((a+6)+"\t"+(a+7)+"\t "+po);
	}

}
