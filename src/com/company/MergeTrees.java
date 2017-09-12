package com.company;

/**
 * Created by Ashutosh.Purohit on 7/6/17.
 */
public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode temp = new TreeNode(-1);
        if (t1==null && t2==null){
            return null;
        }

        else if(t1 == null){
            return t2;
        }
        else if (t2 == null){
            return t1;
        }
        else{

            temp.val = t1.val + t2.val;
            temp.left = mergeTrees(t1.left,t2.left);
            temp.right = mergeTrees(t1.right,t2.right);
            return temp;}



    }
}
