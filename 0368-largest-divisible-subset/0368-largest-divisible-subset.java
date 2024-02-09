class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer>[] graph = buildGraph(nums);
        
        int longest = Integer.MIN_VALUE;
        int nextId = 0;
        
        int[] length = new int[nums.length];
        int[] next = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int len = runDFS(graph, length, next, nums, i);
            if (len > longest) {
                longest = len;
                nextId = i;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        while(nextId != -1) {
            ans.add(nums[nextId]);
            nextId = next[nextId];
        }
        
        return ans;
    }
    
    private int runDFS(List<Integer>[] graph, int[] length, int[] next, int[] nums, int id) {
        if (length[id] != 0) {
            return length[id];
        }
        
        int idMaxLen = 1;
        int nextId = -1;
        for(int child : graph[id]) {
            int tempLen = 1 + runDFS(graph, length, next, nums, child);
            if (tempLen > idMaxLen) {
                idMaxLen = tempLen;
                nextId = child;
            }
        }
        
        length[id] = idMaxLen;
        next[id] = nextId;
        
        return idMaxLen;
    }
    
    private List<Integer>[] buildGraph(int[] nums) {
        List<Integer>[] graph = new ArrayList[nums.length];
        for(int i = 0; i < nums.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] % nums[j] == 0) {
                    graph[i].add(j);
                }
                
                if (nums[j] % nums[i] == 0) {
                    graph[j].add(i);
                }
            }
        }
        
        return graph;
    }
}