package com.company.Trees;

import com.company.LinkedList.Node;

/**
 * Created by Ashutosh.Purohit on 8/15/17.
 */
public class BSTCheck {

    boolean checkBST(com.company.Trees.Node root) {

        if (root == null) {
            return true;
        } else {
            return (true == lefttreetraversal(root.left, root)) && (true == righttreetraversal(root.right, root))
                    && (true == checkBST(root.left)) && (true == checkBST(root.right));


        }
    }


    boolean lefttreetraversal(com.company.Trees.Node root, com.company.Trees.Node head) {

        if (root == null) {
            return true;
        } else if (root.data < head.data) {
            return (true == lefttreetraversal(root.left, head) && true == lefttreetraversal(root.right, head));
        } else {
            return false;
        }

    }

    boolean righttreetraversal(com.company.Trees.Node root, com.company.Trees.Node head) {

        if (root == null) {
            return true;
        } else if (root.data > head.data) {
            return (true == righttreetraversal(root.left, head) && true == righttreetraversal(root.right, head));
        } else {
            return false;
        }
    }
}
