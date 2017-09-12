package com.company;

/**
 * Created by Ashutosh.Purohit on 7/6/17.
 */
public class MaxTreeDepth {

    public int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));


    }
}
