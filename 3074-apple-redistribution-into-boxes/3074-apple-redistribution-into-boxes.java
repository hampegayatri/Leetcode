class Solution {
    public int minimumBoxes(int[] ap, int[] ca) {
        int sum = 0;
        for(int i=0; i<ap.length; i++){
            sum+=ap[i];
        }

        Arrays.sort(ca);
        int ans = 0;
        for(int i=ca.length-1; i>=0; i--){
            if(sum<=0) break;
            sum-=ca[i];
            ans++;
        }
        return ans;
    }
}