/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode qu) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(p);
        q.add(qu);
        while(!q.isEmpty()){
            TreeNode n1=q.poll();
            TreeNode n2=q.poll();
            if(n1==null && n2==null) continue;
            if(n1==null || n2==null ||n1.val!=n2.val) return false;
            q.add(n1.left);
            q.add(n2.left);
            q.add(n1.right);
            q.add(n2.right);
        }
        return true;
    }
}
