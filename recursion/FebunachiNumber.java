package recursion;
import java.util.Scanner;
public class FebunachiNumber {
public static int febonachi(int num) {
	if(num==0) {
		return 0;
	}else if(num==1) {
		return 1;
	}
	else {
		return febonachi( num-1)+febonachi(num-2);
	}
}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Which number do you want from the febonachi series");
int num=sc.nextInt();
int k=febonachi(num);
System.out.println(k);
	}

}
