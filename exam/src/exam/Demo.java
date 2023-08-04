package exam;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Akash");
//	Scanner sc=new Scanner(System.in);	
//	int a=sc.nextInt();
//	sc.nextLine();
//	String b=sc.nextLine();
//	System.out.println(a);
//	System.out.println(b);
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%d       %d",s1,x);
        }
        System.out.println("================================");
	
	}

}
