package com.example.demo.node;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {

    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        TreeNode oneL = new TreeNode(1, new TreeNode(), new TreeNode());
        TreeNode sevenR = new TreeNode(7, new TreeNode(), new TreeNode());
        TreeNode nine = new TreeNode(9, new TreeNode(), new TreeNode());
        TreeNode twoL = new TreeNode(2, oneL, new TreeNode());
        TreeNode fourL = new TreeNode(4, new TreeNode(), new TreeNode());
        TreeNode eightR = new TreeNode(88, sevenR, nine);
        TreeNode threeL = new TreeNode(9, twoL, fourL);
        TreeNode sixR = new TreeNode(6, twoL, fourL);
        TreeNode start5 = new TreeNode(5, threeL, sixR);

//        System.out.println(maxDepth(start5));

//        IncreasingBST lol = new IncreasingBST(88, new IncreasingBST(), new IncreasingBST());
//        System.out.println(lol.increasingBST(lol));
//        System.out.println(lol.val);
        int[] arr = new int[100];
        List<Integer> list = new ArrayList<>();
//        System.out.println(checkAll(start5));

        System.out.println(rec(start5));

    }


    public boolean evaluateTree(TreeNode root) {

        return (lol(root) == 1);
    }

    private static int lol(TreeNode root) {

        if (root.left == null && root.right == null) return root.val;

        int left = lol(root.left);
        int right = lol(root.right);

        if (root.val == 2) return left | right;
        if (root.val == 3) return left & right;

        return root.val;
    }


    static ArrayList<Integer> list = new ArrayList<>();

    private static List<Integer> rec(TreeNode root) {

//        if (root == null ) return list;

        if (root.left != null) {
            rec(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            rec(root.right);
        }
        System.out.println(list);

        return list;

    }


    public static boolean isSymmetric(TreeNode root) {

        if (root.left == null && root.right == null) return true;
        if (root.left == null) return false;
        if (root.right == null) return false;
        List<Integer> left = checkLeft(root.left);
        List<Integer> right = checkRight(root.right);
        System.out.println(left);
        System.out.println(right);

        return left.equals(right);
    }

    private static boolean checkAll(TreeNode root) {

        if (root.left == null && root.right == null) return true;
        if (root.left == null) return false;
        if (root.right == null) return false;
        TreeNode left = root.left;
        TreeNode right = root.right;

        Stack<TreeNode> stackLeft = new Stack<>();
        Stack<TreeNode> stackRight = new Stack<>();
        stackLeft.push(left);
        stackRight.push(right);

        while (!stackLeft.isEmpty()) {
            if (!stackRight.isEmpty()) return false;

            TreeNode nodeLeft = stackLeft.pop();
            TreeNode nodeRight = stackRight.pop();

            System.out.println(nodeLeft.val + " nodeLeft");
            System.out.println(nodeRight.val + " nodeRight");

            if (nodeLeft.left != null && nodeRight.right != null) {
                if (nodeLeft.left.val != nodeRight.right.val) return false;
                stackLeft.push(nodeLeft.left);
                stackRight.push(nodeRight.right);
            } else {
                return false;
            }

            if (nodeLeft.right != null && nodeRight.left != null) {
                if (nodeLeft.right.val != nodeRight.left.val) return false;
                stackLeft.push(nodeLeft.right);
                stackRight.push(nodeRight.left);
            } else {
                return false;
            }

        }
        return true;
    }

    private static List<Integer> checkLeft(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();


            if (node.left != null) {
                stack.push(node.left);
            } else {
                list.add(null);
            }
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            } else {
                list.add(null);
            }
        }
        return list;
    }


    private static List<Integer> checkRight(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();


            if (node.right != null) {
                stack.push(node.right);
            } else {
                list.add(null);
            }
            list.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            } else {
                list.add(null);
            }
        }
        return list;
    }


    private static List<Integer> stack(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if ((node.right != null || node.left != null) && node.val == 0) list.add(node.val);
            if (node.val != 0) list.add(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return list;

    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        List<Integer> list = new ArrayList<>();
        int count = 0;
        list = maxCount(root, count, list);
        System.out.println(list + " maxCount");
        int maxCount = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            maxCount = Math.max(maxCount, list.get(i));
        }

        return maxCount;

    }

    public static List<Integer> maxCount(TreeNode root, int count, List<Integer> list) {


        if (root.left != null) {
//
            maxCount(root.left, count++, list);
        } else {
            count--;
        }
        list.add(count);

        if (root.right != null) {
//            list.add(count++);
            maxCount(root.right, count++, list);

        } else {
            count--;
        }


        return list;

    }

    public static List<Integer> sum(TreeNode root, List<Integer> list, int count) {


        if (root.left != null) {
//                list.add(count++);
            if (root.left == null && root.right == null) {
                count = 1;
            }
            sum(root.left, list, count);
        }
        list.add(count++);
        if (root.right != null) {
            list.add(count++);
            if (root.left == null && root.right == null) {
                count = 1;
            }
        }
        list.add(count++);

        return list;

    }


    public TreeNode increasingBST(TreeNode root) {

        if (root.left == null && root.right == null)
            return new TreeNode(root.val, null, null);

        List<Integer> list = new ArrayList<>();

        list = all(root, list);
        System.out.println(list);
//        Collections.sort(list);
        int size = list.size();
        int max;
        int last = list.size() - 1;

        while (list.get(last) == null) {
            last--;

        }

        max = list.get(last);

        TreeNode treeNode = new TreeNode(max, null, null);
        for (int i = last; i >= 0; i--) {
            if (list.get(i) != null) {
                treeNode = new TreeNode(list.get(i), null, treeNode);
            }
        }

        return treeNode;
    }

    public static List<Integer> all(TreeNode root, List<Integer> list) {

        if (root != null) {

            if (root.left != null) {
                all(root.left, list);
            } else {
                list.add(null);
            }
            list.add(root.val);

            if (root.right != null) {
                all(root.right, list);
            } else {
                list.add(null);
            }
        }
        return list;
    }

    private int min(TreeNode left, int min) {

        while (left != null) {

            min = left.val;
            min(left.left, left.val);
            return min;

        }
        return min;
    }
}
