import java.util.Scanner;

public class Recussion {
	public static String[] subsiquenses(String input) {
//		Base case
		if(input.length()==0) {
			String output[]=new String[1];
			output[0]="";
			return output;
		}
//		Recurssion call for all output for ind 1 to last
		String Smalloutput1[]=subsiquenses(input.substring(1));
//		now creat a out put array and copy all thing and copy+add index 0
		String ans[]=new String[Smalloutput1.length*2];
		for(int i=0;i<Smalloutput1.length;i++) {
			ans[i]=Smalloutput1[i];
		}
		for(int i=0;i<Smalloutput1.length;i++) {
			ans[i+Smalloutput1.length]=input.charAt(0)+Smalloutput1[i];
		}
		return ans;
	}
	public static void helper(int arr[],int s,int e) {
//	Base case
		if(s>=e) {
			return;
		}
		int mid=(s+(e-s)/2);
//		Call for left part
		helper(arr,s,mid);
//	Call for Right part		
		helper(arr,mid+1,e);		
//		tIME TO merge
		int mergeArr[]=new int[e-s+1];
		int i=s;
		int j=mid+1;
		int x=0;
		while(i<=mid&&j<=e) {
			if(arr[i]<=arr[j]) {
				mergeArr[x++]=arr[i++];
			}else {
				mergeArr[x++]=arr[j++];
			}
		}
		while(i<=mid) {
			mergeArr[x++]=arr[i++];
		}
		while(j<=e) {
			mergeArr[x++]=arr[j++];
		}
			for(int m=s;m<mergeArr.length;m++) {
				arr[m]=mergeArr[m];
			}
	}
	public static void mergeShort(int arr[]) {
		int s=0;
		int e=arr.length-1;		
		int mid=s+((e-s)/2)	;
		helper(arr,s,e);
	
	}
	public static int binarySearch(int arr[],int s,int e,int x) {
		
//		Base case
		if(s<=e) {
			int mid=(s+e)/2;
			if(x==arr[mid]) {
				return mid;
			}else if(x>=arr[mid]) {
				return binarySearch(arr, mid+1, e, x);
			}else {
				return binarySearch(arr, s, mid-1, x);
			}
		}else {
			return -1;
		}
		
	}
	public static String removePi(String input) {
//		Base case
		if(input.length()==0||input.length()==1) {
			return input;
		}
//		recurssion call
		if(input.charAt(0)=='p'&& input.charAt(1)=='i') {
			String smallWork=removePi(input.substring(2));
			return "3.14"+smallWork;
		}else {
			String smallWork=removePi(input.substring(1));
			return input.charAt(0)+smallWork;
		}
	}
	public static String removeX(String input) {
//		Base case
		if(input.length()==0) {
			return input;
		}
//		REcurssion call
		String smallWork=removeX(input.substring(1));
//		SmallWork
		if(input.charAt(0)=='x') {
			return smallWork;
		}else {
			return input.charAt(0)+smallWork;
		}
	}
	public static String replace_a_b(String s,char a,char b ) {
//Base case
		if(s.length()==0) {
			return s;
		}
//		REcurssion call
		String smallwork=replace_a_b(s.substring(1), a, b);
//		work
		if(s.charAt(0)==a) {
			return b+smallwork;
		}else {
			return s.charAt(0)+smallwork;
		}
	}
	public static boolean isShorted(int input[],int n) {
//		Base case
		if(n==input.length-1) {
			return true;
		}
		//small work +R call
		else {
			if(input[n]>input[n+1]) {
				return false;
			}else {
				return isShorted(input, n+1);
			}
		}
	}
	public static boolean searchNum(int input[],int x,int n) {
//		Base case
		if(n==input.length) {
			return false;
		}
//		small work
		if(x==input[n]) {
			return true;
		}else {//Recursive call
			return searchNum(input, x, n+1);
		}
	}
	public static int sumArray(int input[],int n) {
//	Base case
		if(n==input.length) {
		return 0;
	}else {//small work + recursive call
		return input[n]+sumArray(input, n+1);
	}
	}
	public static int fibonachi(int n) {
//	Base case
	if(n==1||n==2) {
		return 1;
	}
//	Small work
	int n_1=fibonachi(n-1);
	int n_2=fibonachi(n-2);
	return n_1+n_2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String a=sc.next();
String output[]=subsiquenses(a);
for(int i=0;i<output.length;i++) {
	System.out.println(output[i]);
}



	}

}
