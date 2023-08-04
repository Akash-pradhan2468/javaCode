
public class recurssionAssignment {
public static boolean checkAB(String a) {
	if(a.length()==0) {//Base Case
		return true;
	}
	if(a.charAt(0)=='a') {
		if((a.substring(1)).length()>1&&a.substring(1,3).equals("bb")) {
			return checkAB(a.substring(3));
		}else {
			return checkAB(a.substring(1));
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkAB("aba"));
	}

}
