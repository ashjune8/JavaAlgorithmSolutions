package com.company;

/**
 * Created by Ashutosh.Purohit on 7/20/17.
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {

        if (root == null){
            return true;
        }
        TreeNode lefttree = root.left;
        TreeNode righttree = root.right;
        return mirrorcheck(lefttree,righttree);

    }

    public boolean mirrorcheck(TreeNode lefttree, TreeNode righttree){

        if(lefttree==null && righttree == null){
            return true;
        }
        else if (lefttree== null || righttree == null){
            return false;
        }
        else if (lefttree.val != righttree.val){
            return false;
        }
        else{
            return mirrorcheck(lefttree.left, righttree.right) == true && mirrorcheck(lefttree.right,
                    righttree.left) == true;
        }
    }
}
