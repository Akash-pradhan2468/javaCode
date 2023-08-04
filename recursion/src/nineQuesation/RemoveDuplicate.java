package nineQuesation;

public class RemoveDuplicate {
public static boolean map[]=new boolean[26];
public static void removeduplicate(String a,int idx,String newString) {
	if(idx==a.length()) {
		System.out.println(newString);
		return;
	}
	if(map[a.charAt(idx)-'a']==true) {
		removeduplicate(a, idx+1, newString);
	}else {
		newString=newString+a.charAt(idx);
		map[a.charAt(idx)-'a']=true;
		removeduplicate(a, idx+1, newString);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
removeduplicate("akasgffgg", 0, "");
	}

}
