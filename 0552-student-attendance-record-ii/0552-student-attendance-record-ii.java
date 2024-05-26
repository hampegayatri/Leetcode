class Solution {
    public int checkRecord(int n) {
    int[] dp = { 1, 1, 0, 1, 0, 0 }; // init table for n = 1
    for (int i = 2; i <= n; i++) // updating table for n = i
        dp = new int[] { sum(dp, 0, 2), dp[0], dp[1], sum(dp, 0, 5), dp[3], dp[4] };
    return sum(dp, 0, 5);       
}                                   

static int sum(int[] arr, int l, int h) {
    int s = 0;  
    for (int i = l; i <= h; i++) 
        s = (s + arr[i]) % 1000000007;  
    return s;                   
}
}