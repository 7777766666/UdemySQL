package com.example.demo.node;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    public TreeNode2(int val){
        this.val = val;
    }


    public static void main(String[] args) {

        TreeNode2 fiveL = new TreeNode2(5, new TreeNode2(8), new TreeNode2(9));
        TreeNode2 fiveR = new TreeNode2(5, null, null);
        TreeNode2 fourL = new TreeNode2(4, null, null);
        TreeNode2 fourR = new TreeNode2(4, new TreeNode2(8), new TreeNode2(9));
        TreeNode2 threeL = new TreeNode2(3, fourL, fiveL);
        TreeNode2 threeR = new TreeNode2(3, fourR, fiveR);
        TreeNode2 start2 = new TreeNode2(2, threeL, threeR);




        TreeNode2 q = new TreeNode2(1, new TreeNode2(), new TreeNode2());
        q.right.setVal(2);


        System.out.println(start2.isSymmetric(start2) + "   result");



    }

    public boolean isSymmetric(TreeNode2 root) {

        if (root.left == null && root.right == null) return true;
        if (root.left == null) return false;
        if (root.right == null) return false;

        return recurseSymmetric(root.left, root.right);


    }

    private static boolean recurseSymmetric(TreeNode2 left, TreeNode2 right) {

        while (true) {

            if (left.val != right.val) return false;
            if ((left.left != null && right.right == null) || (left.left == null && right.right != null) ) {
                return false;
            }
            if ((left.right != null && right.left == null) || (left.right == null && right.left != null)) {
                return false;
            }

            if (left.left != null) {
                if (left.left.val != right.right.val) return false;
                recurseSymmetric(left.left, right.right);
            }
            if (left.right != null){
                if (left.right.val != right.left.val) return false;
                recurseSymmetric(left.right, right.left);
            }

            return true;
        }
    }

    private static List<Integer> recurseRight(List<Integer> list, TreeNode2 x) {

        if (x == null) return list;
        while (true) {
            list.add(x.val);
            if (x.right == null) {
                list.add(null);
            } else {
                recurseRight(list, x.right);
            }
            if (x.left == null) {
                list.add(null);
            } else {
                recurseRight(list, x.left);
            }
            return list;
        }
    }


    public boolean isSameTree(TreeNode2 p, TreeNode2 q) {

        List<Integer> first = recurse(new ArrayList<>(), p);
        List<Integer> second = recurse(new ArrayList<>(), q);

        return first.equals(second);
    }

    private static List<Integer> recurse(List<Integer> list, TreeNode2 x) {

        if (x == null) return list;
        while (true) {
            list.add(x.val);
            if (x.left == null) {
                list.add(null);
            } else {
                recurse(list, x.left);
            }
            if (x.right == null) {
                list.add(null);
            } else {
                recurse(list, x.right);
            }
            return list;
        }
    }


}

