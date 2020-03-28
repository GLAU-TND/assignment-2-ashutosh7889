/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.ArrayList;
import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        MyQueue queue = new MyQueue();
        System.out.println("Enter number of nodes ");
        int numberOfNodes = scan.nextInt();
        while (numberOfNodes-- > 0) {
            System.out.println("Enter data");/*--->*/
            int data = scan.nextInt();
            TreeNode treeNode = new TreeNode();
            treeNode.setData(data);
            bst.insert(treeNode);
        }
        ArrayList<Integer> arrayList = bst.getPreOrderList();
    }
}
