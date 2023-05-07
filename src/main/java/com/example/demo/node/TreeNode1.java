package com.example.demo.node;


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1() {
    }

    public TreeNode1(int val) {
        this.val = val;
    }

    public TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setTreeNode(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static void main(String[] args) {

        TreeNode1 treeNode1 = new TreeNode1();
        int val1 = 1;
        TreeNode1 left1 = null;
        TreeNode1 right1 = new TreeNode1();
        treeNode1.setTreeNode(val1, left1, right1);
        int val2 = 2;
        int val3 = 3;
        TreeNode1 left2 = new TreeNode1(val3);
        TreeNode1 right2 = null;
        right1.setTreeNode(val2, left2, right2);
        int val4 = 4;
        int val5 = 5;
        TreeNode1 left3 = new TreeNode1(val4);
        TreeNode1 right3 = new TreeNode1();
        left2.setTreeNode(val3, left3, right3);
        right3.setVal(val5);

        System.out.print(treeNode1.val + " "); //1
        System.out.print(treeNode1.right.val + " "); //2
        System.out.print(treeNode1.right.left.val + " "); //3
        System.out.print(treeNode1.right.left.left.val + " "); //4
        System.out.print(treeNode1.right.left.right.val + " \n"); //5

        System.out.println(TreeNode1.inorderTraversal(treeNode1) + "  result treeNode");
    }

    static List<Integer> list = new ArrayList<>();

    private static List<Integer> inorderTraversal(TreeNode1 root) {

        if (root == null) return list;

        while (true) {

            if (root.left != null) inorderTraversal(root.left);
            list.add(root.val);
            if (root.right != null) inorderTraversal(root.right);

            return list;
        }
    }

    private static List<Integer> recurse(List<Integer> list, TreeNode1 root) {

        if (root.left != null) recurse(list, root.left);
        list.add(root.val);
        if (root.right != null) recurse(list, root.right);

        return list;
    }
}
