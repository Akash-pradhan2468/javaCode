package dynamicPrograming;

public class LongestCommonSubsiquences {
	public static int helper(String a,String b,int i,int j,int dp[][]) {
//		Base case
	if(i==a.length()) {
		return 0;
	}
	if(j==b.length()) {
		return 0;
	}
	if(dp[i][j]!=-1) {
		return dp[i][j];
	}
	int ans;
	if(a.charAt(i)==b.charAt(j)) {
		ans=1+helper(a, b, i+1, j+1, dp);
		return ans;
	}else {
		ans=Math.max(helper(a, b, i+1, j, dp), helper(a, b, i, j+1, dp));
		return ans;
	}
	}
public static int longest(String a,String b) {
	int dp[][]=new int[a.length()][b.length()];
	for(int i=0;i<a.length();i++) {
		for(int j=0;j<b.length();j++) {
			dp[i][j]=-1;
		}
	}
return helper(a, b, 0, 0,dp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(longest("abcdef", "bef"));
	}

}
