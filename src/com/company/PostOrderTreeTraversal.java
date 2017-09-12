package com.company;

/**
 * Created by Ashutosh.Purohit on 8/12/17.
 */
public class PostOrderTreeTraversal {

    void postOrder(Node root) {

        if (root != null){



            if (root.left != null){
                postOrder(root.left);
            }





            if (root.right != null){
                postOrder(root.right);
            }

            System.out.print(root.data);
            System.out.print(" ");

        }




    }


}
