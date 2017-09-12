package com.company;

/**
 * Created by Ashutosh.Purohit on 8/12/17.
 */
public class PreOrderTreeTraversal {

    void preOrder(Node root) {



        if (root != null){

            System.out.print(root.data);
            System.out.print(" ");

            if (root.left != null){
                preOrder(root.left);
            }



            if (root.right != null){
                preOrder(root.right);
            }

        }



    }
}
