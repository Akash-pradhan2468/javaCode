package Array;

public class Q2REverseArray {
	public static String reverse(String str) {
		char arr[]=new char[str.length()];
		int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(j);
            j--;
        }
        String a="";
        for(int i=0;i<arr.length;i++){
            a=a+arr[i];
        }
        return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Akash";

System.out.println(reverse(a));
char arr[]= {'a','b'};
System.out.println(arr.length);
	}

}
