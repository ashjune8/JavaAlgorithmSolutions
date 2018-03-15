package com.company.Trees;

/**
 * Created by Ashutosh.Purohit on 1/21/18.
 */
public class ValidSumTree {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(1);
        a.left= b;
        a.right = c;
        b.left = d;
        ValidSumTree validSumTree = new ValidSumTree();
        System.out.println(validSumTree.validsumtree(a));


    }

  public boolean validsumtree(TreeNode root){

      if (root.left == null && root.right == null){
          return true;
      }

      else if (root.left == null){

          return true == (root.right.val == root.val ) == validsumtree(root.right);
      }

      else if (root.right == null){

          return true == (root.left.val == root.val ) == validsumtree(root.left);
      }

      else{

          return ((root.left.val + root.right.val)== root.val) == validsumtree(root.left) == validsumtree(root.right);
      }
  }
}
