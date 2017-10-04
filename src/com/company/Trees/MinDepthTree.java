package com.company.Trees;

/**
 * Created by Ashutosh.Purohit on 7/20/17.
 */
public class MinDepthTree {
    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);

        MinDepthTree minDepthTree = new MinDepthTree();
        System.out.println(minDepthTree.minDepth(a));
    }

    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        else if (root.left == null && root.right == null){
            return 1;
        }

        else{
         return findmin(root);
        }

    }
    public int findmin(TreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        else if (root.left == null){
            return 1 +findmin(root.right);
        }
        else if (root.right == null){
            return 1 +findmin(root.left);
        }
        else {
            return Math.min((1+findmin(root.left)),(1+findmin(root.right)));
        }
    }
}
