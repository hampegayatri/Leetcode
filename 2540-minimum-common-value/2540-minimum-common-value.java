class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        // we start from the 0-th index of both arrays
        // note that, we might be at unequal elements at the start
        while (i < nums1.length && j < nums2.length) {
            // if at nums1 we are at a lower value
            // we will move forward and try to match 
            if (nums1[i] < nums2[j]) {
                i++;
            } 
            // if at nums2 we are at a lower value
            // we will move forward and try to match 
            else if (nums1[i] > nums2[j]) {
                j++;
            } 
            // when we finally match, we get the lowest common element
            else {
                return nums1[i];    // so we return it
            }
        }
        
        // if we finish iteration and don't find any match
        return -1;  // we return -1
    }
}
