package com.company;

/**
 * Created by Ashutosh.Purohit on 7/6/17.
 */
public class Tree2str {

    public String tree2str(TreeNode t) {

        if (t == null){
            return "";
        }
        if(t.left == null && t.right == null){
            return Integer.toString(t.val);
        }
        if (t.right==null ){
            return Integer.toString(t.val) + '(' + tree2str(t.left) + ')';
        }
        else{
            return Integer.toString(t.val) + '(' + tree2str(t.left) + ')'+ '(' + tree2str(t.right) + ')';

        }


    }
}
