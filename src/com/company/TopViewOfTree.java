package com.company;

/**
 * Created by Ashutosh.Purohit on 8/12/17.
 */
public class TopViewOfTree {

    public static void main(String[] args) {
        TopViewOfTree topViewOfTree = new TopViewOfTree();

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        Node f = new Node();
        a.data = 1;
        b.data = 2;
        c.data = 5;
        d.data = 3;
        e.data = 6;
        f.data = 4;
        a.right = b;
        b.right = c;
        c.left = d;
        c.right = e;
        d.right = f;

        topViewOfTree.topView(a);

    }

    void topView(Node root) {
        if (root.left != null){
        printlefttree(root.left);}
        System.out.print(root.data);
        System.out.print(" ");
        if (root.right != null){
        printrighttree(root.right);}


    }

    void printlefttree(Node root){

        if (root.left == null){
            System.out.print(root.data);
            System.out.print(" ");

        }
        else{
            printlefttree(root.left);
            System.out.print(root.data);
            System.out.print(" ");
        }
    }

    void printrighttree(Node root){

        if (root.right == null){
            System.out.print(root.data);
            System.out.print(" ");

        }
        else{
            System.out.print(root.data);
            System.out.print(" ");
            printrighttree(root.right);

        }
    }
}
