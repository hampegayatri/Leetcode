class Solution {
    public int numberOfBeams(String[] bank) {
        
        int prevCount = 0;
        int totalBeams = 0;

        for (String s : bank) {
            int currentCount = countOnes(s);

            if (currentCount > 0) {
                totalBeams += prevCount * currentCount;
                prevCount = currentCount;
            }
        }

        return totalBeams;
    }

    private int countOnes(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}