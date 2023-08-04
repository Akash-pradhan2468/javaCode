package recursion2;

public class Powerset {
//	Creat the recusive matode in which one given array a tracker index and a ans string
static void solve(String a,int i,String an,String ans[]) {
//	Base case
	if(i>=a.length()) {//if index >=size print ans and return
		ans[i]=a;
		return;
	}
//	Call for including index
	solve(a,i+1,an+a.charAt(i),ans);
//	Call for excluding index
	
	solve(a,i+1,an,ans);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="1bcd";
String ans[]= {};
solve(a,0,"",ans);
for(int i=0;i<ans.length;i++) {
	System.out.print(ans[i]);
	
}
System.out.println();
	}

}
