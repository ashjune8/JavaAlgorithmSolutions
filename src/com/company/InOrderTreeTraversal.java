package com.company;

/**
 * Created by Ashutosh.Purohit on 8/12/17.
 */
public class InOrderTreeTraversal {

    void inOrder(Node root) {

        if (root != null){



            if (root.left != null){
                inOrder(root.left);
            }


            System.out.print(root.data);
            System.out.print(" ");


            if (root.right != null){
                inOrder(root.right);
            }



        }





    }
}
