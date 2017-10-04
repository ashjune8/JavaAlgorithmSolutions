package com.company.Trees;

/**
 * Created by Ashutosh.Purohit on 7/11/17.
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q==null){
            return true;
        }
        if ( (p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        else{
            return (isSameTree(p.left,q.left) == true) && (isSameTree(p.right,q.right) == true);
        }

    }
}
