package recursion;
import java.util.Scanner;
public class OccuranceOfCharacter {
public static int first=-1;
public static int last=-1;
public static void printfl(String a,char b,int idx) {
	if(idx==a.length()) {
		System.out.println(first);
		System.out.println(last);
		return;
	}
char currentelement=a.charAt(idx);
	if(currentelement==b) {
		if(first==-1) {
			first=idx;
		}else {
			last=idx;
		}
		
	}else {
		printfl(a, b, idx+1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
printfl(a, 'a', 1);
	}

}
