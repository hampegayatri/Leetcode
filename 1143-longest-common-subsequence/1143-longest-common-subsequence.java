class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length()==0||text2.length()==0) return 0;
        int dp[][] = new int[text1.length()+1][text2.length()+1];
		
        for(int i=1;i<text1.length()+1;i++){
            for(int j=1;j<text2.length()+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
				//if match, add lcs +1
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
				//if no match, skip
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}