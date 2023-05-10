package com.example.demo.node;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

        int[] nums = {-99, -10, -3, -1, 0, 1, 2, 5, 9, 88, 200};
        System.out.println(sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        int length = nums.length;
        if ( length == 1) return new TreeNode(nums[0], null, null);
        if (length == 2) return new TreeNode(nums[0], null, new TreeNode(nums[1]));
        if (length == 3) return  new TreeNode(nums[1], new TreeNode(nums[0]), new TreeNode(nums[2]));



        int pivot = length / 2;

        TreeNode l = new TreeNode(nums[0], null, null);

        for (int i = 1; i < pivot - 1; i++) {
            l = new TreeNode(nums[i], l, null);

        }
        TreeNode r = new TreeNode(nums[length - 1]);
        for (int i = length - 2; i > pivot; i--) {

            r = new TreeNode(nums[i], null, r);
        }
        TreeNode result = new TreeNode(nums[pivot], l, r);


        System.out.println(l.val);
        System.out.println(l.left.val);
        System.out.println(l.left.left.val);
        System.out.println(l.left.left.left.val);

        System.out.println("----------------------");
        System.out.println(r.val);
        System.out.println(r.right.val);
        System.out.println(r.right.right.val);
        System.out.println(r.right.right.right.val);

        System.out.println("----------");
        System.out.println(result.left.val);
        System.out.println(result.right.val);


        return result;
    }
}
