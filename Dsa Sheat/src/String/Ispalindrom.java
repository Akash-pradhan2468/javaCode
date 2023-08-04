package String;

public class Ispalindrom {
	public static boolean isPalindrome(String s) {
        int mid=(s.length()+1)/2;
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome("man"));
	}

}
