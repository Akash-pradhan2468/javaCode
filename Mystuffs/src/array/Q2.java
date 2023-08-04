package array;

public class Q2 {
	   public static String reverseWord(String str)
	    {
	        // Reverse the string str
	        String a="";
	        for(int i=str.length()-1;i>=0;i--){
	            a=a+str.charAt(i);   
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="geeas";
String c=reverseWord(a);
System.out.println(c);

	}

}
