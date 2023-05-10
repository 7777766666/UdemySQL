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
public class TreeNodeSuper {

    private int val;
    private TreeNodeSuper left;
    private TreeNodeSuper right;

    public TreeNodeSuper(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        TreeNodeSuper oneL = new TreeNodeSuper(1, new TreeNodeSuper(), new TreeNodeSuper());
        TreeNodeSuper sevenR = new TreeNodeSuper(7, new TreeNodeSuper(), new TreeNodeSuper());
        TreeNodeSuper nine = new TreeNodeSuper(9, new TreeNodeSuper(), new TreeNodeSuper());
        TreeNodeSuper twoL = new TreeNodeSuper(2, oneL, new TreeNodeSuper());
        TreeNodeSuper fourL = new TreeNodeSuper(4, new TreeNodeSuper(), new TreeNodeSuper());
        TreeNodeSuper eightR = new TreeNodeSuper(88, sevenR, nine);
        TreeNodeSuper threeL = new TreeNodeSuper(9, twoL, fourL);
        TreeNodeSuper sixR = new TreeNodeSuper(6, twoL, fourL);
        TreeNodeSuper start5 = new TreeNodeSuper(5, threeL, sixR);

//        System.out.println(maxDepth(start5));

//        IncreasingBST lol = new IncreasingBST(88, new IncreasingBST(), new IncreasingBST());
//        System.out.println(lol.increasingBST(lol));
//        System.out.println(lol.val);
        int[] arr = new int[100];
        List<Integer> list = new ArrayList<>();
//        System.out.println(checkAll(start5));

        System.out.println(maxDepth(start5));

    }

    public static int maxDepth(TreeNodeSuper root) {
        return maximum(root);
    }
    public static int maximum(TreeNodeSuper root) {
        int left = -1;
        int right = -1;

        if (root != null) {

            left = maximum(root.left);
            right = maximum(root.right);
        }
        return 1 + Math.max(left, right);
    }

    public static int maxDepth1(TreeNodeSuper root) {

        int maxCount = 0;
        int count = 1;


        List<Integer> list = new ArrayList<>();
        if (root == null) return 0;

        if (root.left == null && root.right == null) return 1;
        if (root.left != null && root.right == null) return 2;
        if (root.left == null) return 2;


        Stack<TreeNodeSuper> stack = new Stack<>();
        stack.push(root);


        while (!stack.isEmpty()) {
            count++;
            TreeNodeSuper node = stack.peek();
            if (node.left != null) {
                count++;
                stack.push(node.left);
            }

            if (node.right != null) {
                count++;
                stack.push(node.right);
            }
            maxCount = Math.max(maxCount, count);
            list.add(node.val);
            System.out.println(list);

        }
        return maxCount;

    }


    public boolean evaluateTree(TreeNodeSuper root) {

        return (lol(root) == 1);
    }

    private static int lol(TreeNodeSuper root) {

        if (root.left == null && root.right == null) return root.val;

        int left = lol(root.left);
        int right = lol(root.right);

        if (root.val == 2) return left | right;
        if (root.val == 3) return left & right;

        return root.val;
    }


    static ArrayList<Integer> list = new ArrayList<>();

    private static List<Integer> rec(TreeNodeSuper root) {

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


    public static boolean isSymmetric(TreeNodeSuper root) {

        if (root.left == null && root.right == null) return true;
        if (root.left == null) return false;
        if (root.right == null) return false;
        List<Integer> left = checkLeft(root.left);
        List<Integer> right = checkRight(root.right);
        System.out.println(left);
        System.out.println(right);

        return left.equals(right);
    }

    private static boolean checkAll(TreeNodeSuper root) {

        if (root.left == null && root.right == null) return true;
        if (root.left == null) return false;
        if (root.right == null) return false;
        TreeNodeSuper left = root.left;
        TreeNodeSuper right = root.right;

        Stack<TreeNodeSuper> stackLeft = new Stack<>();
        Stack<TreeNodeSuper> stackRight = new Stack<>();
        stackLeft.push(left);
        stackRight.push(right);

        while (!stackLeft.isEmpty()) {
            if (!stackRight.isEmpty()) return false;

            TreeNodeSuper nodeLeft = stackLeft.pop();
            TreeNodeSuper nodeRight = stackRight.pop();

            System.out.println(nodeLeft.val + " nodeLeft");
            System.out.println(nodeRight.val + " nodeRight");

            if (nodeLeft.left != null && nodeRight.right != null) {
                if (nodeLeft.left.val != nodeRight.right.val) return false;
                TreeNodeSuper push = stackLeft.push(nodeLeft.left);
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

    private static List<Integer> checkLeft(TreeNodeSuper root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNodeSuper> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNodeSuper node = stack.pop();


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


    private static List<Integer> checkRight(TreeNodeSuper root) {

        Stack<TreeNodeSuper> stack = new Stack<>();
        stack.push(root);
        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty()) {
            TreeNodeSuper node = stack.pop();


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


    private static List<Integer> stack(TreeNodeSuper root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNodeSuper> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNodeSuper node = stack.pop();
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

    public static int maxDepth2(TreeNodeSuper root) {
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

    public static List<Integer> maxCount(TreeNodeSuper root, int count, List<Integer> list) {


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

    public static List<Integer> sum(TreeNodeSuper root, List<Integer> list, int count) {


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


    public TreeNodeSuper increasingBST(TreeNodeSuper root) {

        if (root.left == null && root.right == null)
            return new TreeNodeSuper(root.val, null, null);

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

        TreeNodeSuper treeNodeSuper = new TreeNodeSuper(max, null, null);
        for (int i = last; i >= 0; i--) {
            if (list.get(i) != null) {
                treeNodeSuper = new TreeNodeSuper(list.get(i), null, treeNodeSuper);
            }
        }

        return treeNodeSuper;
    }

    public static List<Integer> all(TreeNodeSuper root, List<Integer> list) {

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

    private int min(TreeNodeSuper left, int min) {

        while (left != null) {

            min = left.val;
            min(left.left, left.val);
            return min;

        }
        return min;
    }
}
