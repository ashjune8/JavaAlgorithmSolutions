package com.company.Trees;

/**
 * Created by Ashutosh.Purohit on 1/21/18.
 */

public class Minimumelementbst {


    public static void main(String[]args){

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        a.left= b;
        a.right = c;
        b.left = d;
        Minimumelementbst minimumelementbst = new Minimumelementbst();
        System.out.println(minimumelementbst.findmin(a));




    }

    public int findmin(TreeNode root){

        while (root.left != null){
            root = root.left;
        }
        return root.val;



    }
}
