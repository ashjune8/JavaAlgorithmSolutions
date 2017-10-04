package com.company.Trees;

/**
 * Created by Ashutosh.Purohit on 7/22/17.
 */
public class findTilt {

    public int findTilt(TreeNode root) {

        if(root == null){
            return 0;
        }
        else{
            return Math.abs(nodesum(root.left)-nodesum(root.right))+ findTilt(root.left)+findTilt(root.right);
        }

    }

    private int nodesum(TreeNode root){
        if (root == null){
            return 0;
        }
        else{
            return root.val + nodesum(root.left)+ nodesum(root.right);
        }
    }
}
