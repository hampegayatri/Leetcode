class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;

        int len = 0;
        ListNode current = head;
        while(current != null) {
            len++;
            current = current.next;
        }
        
        len /= 2;
        current = head;
        while(len > 0) {
            current = current.next;
            len--;
        }
        
        return current;
    }
}