package com.company.Trees;

import com.company.LinkedList.Node;

/**
 * Created by Ashutosh.Purohit on 8/12/17.
 */
public class PostOrderTreeTraversal {

    void postOrder(com.company.Trees.Node root) {

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
