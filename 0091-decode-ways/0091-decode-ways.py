class Solution:
    def numDecodings(self, s: str) -> int:
        n=len(s)
        dp=[-1]*(n+1)
        def f(i):
            if i==n: return 1
            if dp[i]!= -1: return dp[i]
            if s[i]=='0':
                dp[i]=0
                return 0
            ans=f(i+1)
            if (i+1<n and (s[i]=='1' or (s[i]=='2' and s[i+1]<='6'))):
                ans+=f(i+2)
            dp[i]=ans
            return ans
    
        return f(0)