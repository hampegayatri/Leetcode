class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        int n = heights.length;
        int i = 0;
        for(i = 0 ; i < n-1 ; i++)
        {
            if(heights[i+1] <= heights[i])
                    continue;
            
            if(heights[i+1] > heights[i] && ladders > 0)
            {
                pq.add(heights[i+1] - heights[i]);
                ladders--;
            }else{
                break;
            }
        }
        
        // System.out.println(i);
        
        for( ; i < n-1 ; i++)
        {
            if(heights[i+1] <= heights[i])
                    continue;
            
            int diff = heights[i+1] - heights[i];
            if(!pq.isEmpty() && diff > pq.peek() && bricks >= pq.peek())
            {
                pq.add(diff);
                bricks -= pq.remove();
                
                
            }else if(bricks >= diff){
                bricks-=diff;
               
            }else{
                break;
            }
        }
        
        return i;
    }
}