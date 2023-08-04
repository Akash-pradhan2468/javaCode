import java.util.Scanner;
public class Q1 {
public static boolean isPerfectNumber(int n) {
	int a=n,b=0,c=0,d=n,e=0,f=0;
	for(int i=1;a>0;i--) {
		b=a%10;
		a=a/10;
		c++;//HERE I CALCULATE THE TOTAL DIGIT OF THE NUMBER
	}
	for(int j=1;d>0;j--) {
		e=d%10;
		d=d/10;
		f=f+(int)Math.pow(e, c);
	}
	if(f==n) 
	        return true;		
	else 
		    return false;	
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();	
		System.out.println(n+" is a perfect number "+ isPerfectNumber(n));
                  }

}
 