package recursion2;

public class Recussion {
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
int arr[]= {2,5,6,7,9};

System.out.println(binarySearch(arr, 0, arr.length-1, 7));
	}

}
