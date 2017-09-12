package com.company;

/**
 * Created by Ashutosh.Purohit on 8/15/17.
 */
public class BSTCheck {

    boolean checkBST(Node root) {

        if (root == null) {
            return true;
        } else {
            return (true == lefttreetraversal(root.left, root)) && (true == righttreetraversal(root.right, root))
                    && (true == checkBST(root.left)) && (true == checkBST(root.right));


        }
    }


    boolean lefttreetraversal(Node root, Node head) {

        if (root == null) {
            return true;
        } else if (root.data < head.data) {
            return (true == lefttreetraversal(root.left, head) && true == lefttreetraversal(root.right, head));
        } else {
            return false;
        }

    }

    boolean righttreetraversal(Node root, Node head) {

        if (root == null) {
            return true;
        } else if (root.data > head.data) {
            return (true == righttreetraversal(root.left, head) && true == righttreetraversal(root.right, head));
        } else {
            return false;
        }
    }
}
