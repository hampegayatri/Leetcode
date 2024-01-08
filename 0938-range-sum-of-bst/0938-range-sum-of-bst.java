class Solution {
  public int rangeSumBST(TreeNode node, int low, int high) {
    if (node == null) return 0;
    
    return (node.val >= low && node.val <= high ? node.val : 0) +
      (low < node.val ? rangeSumBST(node.left, low, high) : 0) +
      (high > node.val ? rangeSumBST(node.right, low, high) : 0);
  }
}