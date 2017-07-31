package com.company;

import apple.laf.JRSUIUtils;

/**
 * Created by Ashutosh.Purohit on 7/8/17.
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {

        if (root == null){
            return null;
        }
        else{
            TreeNode temp = new TreeNode(root.val);

            temp.left = invertTree(root.right);
            temp.right = invertTree(root.left);
            return temp;
        }

    }
}
