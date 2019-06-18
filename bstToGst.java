/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {

        if(root==null)return null; //If null return null;

        bstToGst(root.right);

        // once done with the right branch
        // store value of node in temp and add it to sum which is 0 at start
        // update sum and change current val of node by adding the sum to it

        int temp = root.val;
        sum = sum + temp;
        root.val = sum;
        bstToGst(root.left);

        return root;
    }


}