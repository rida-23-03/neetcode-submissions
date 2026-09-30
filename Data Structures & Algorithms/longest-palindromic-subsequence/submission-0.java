class Solution {
    public int f(int i,int j,String s,int[][] dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j]; 
        if(s.charAt(i)==s.charAt(j)){
            return 2+f(i+1,j-1,s,dp);
        }
        int l=0+f(i+1,j,s,dp);
        int r=0+f(i,j-1,s,dp);
        dp[i][j]=Math.max(l,r);
        return dp[i][j];

    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int ans=f(0,n-1,s,dp);
        return ans;
    }
}