package com.company.Trees;

import com.company.LinkedList.Node;

/**
 * Created by Ashutosh.Purohit on 8/12/17.
 */
public class InOrderTreeTraversal {

    void inOrder(com.company.Trees.Node root) {

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
