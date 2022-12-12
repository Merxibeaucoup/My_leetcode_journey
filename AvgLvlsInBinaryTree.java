// 637. Average of Levels in Binary Tree


class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();

        if (root == null) {
            return res;
        }

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum =0;

            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                sum += curr.val;

                if(curr.left!= null) queue.add(curr.left);
                 if(curr.right!= null) queue.add(curr.right);
            }

            res.add(sum/ size);
        }

        return res;




        
    }
}
