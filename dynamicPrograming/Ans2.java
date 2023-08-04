package dynamicPrograming;

public class Ans2 {
	public int longestPalinSubseq(String S)
    {
        //code here
        int n=S.length();
        int dp[][]=new int[n+1][n+1];
        String rev=new StringBuilder(S).reverse().toString();
        for(int i=n;i>=0;i--) {
        	for(int j=n;j>=0;j--) {
        		if(i==n||j==n)dp[i][j]=0;
        		else if(S.charAt(i)==rev.charAt(j)) dp[i][j]=1+dp[i+1][j+1];
        		else dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
        	}
        }
        return dp[0][0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
