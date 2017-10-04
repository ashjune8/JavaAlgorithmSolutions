package com.company.Trees;

/**
 * Created by Ashutosh.Purohit on 7/8/17.
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null){
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null){

            return root.left.val + sumOfLeftLeaves(root.right);

        }

        else{
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }



    }
}
