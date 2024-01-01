class Solution {
    public int findContentChildren(int[] childrenGreed, int[] cookieSizes) {
        Arrays.sort(childrenGreed);
        Arrays.sort(cookieSizes);
        int satisfiedChildren = 0;
        int cookieIndex = 0;
        while (cookieIndex < cookieSizes.length && satisfiedChildren < childrenGreed.length) {
            if (cookieSizes[cookieIndex] >= childrenGreed[satisfiedChildren]) {
                satisfiedChildren++;
            }
            cookieIndex++;
        }
        return satisfiedChildren;
    }
}
