// leetcode 653. Two Sum IV - Input is a BST

/*
Given the root of a Binary Search Tree and a target number k, 
return true if there exist two elements in the BST such that 
their sum is equal to the given target.
*/

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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        int left =0;
        int right =list.size()-1;
        
        /*
         while left < right .. to avoid using same element
         if sum found -> true
         if sum < k , increment left, else decrease right
        
        */
        
        while(left < right){
            
            int sum = list.get(left) + list.get(right);
            if(sum == k)
                return true;
            
            if(sum < k){
                left++;

            }
            else
                right--;

        }
        return false;
        
    }
    
    public void inorder(TreeNode root, List <Integer> list){
        if(root ==null)
            return;
        
        inorder(root.left, list); //left value, recursively call
        list.add(root.val); //root value
        inorder(root.right, list); //right value, recursively call

    }
}
