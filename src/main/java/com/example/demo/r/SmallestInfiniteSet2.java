//package com.example.demo.r;
//
//import java.util.ArrayList;
//
//public class SmallestInfiniteSet2 {
//
//
//        private ArrayList<Integer> integerArrayList;
//        private int[] intSet;
//
//        public SmallestInfiniteSet2() {
//
//            int[] arr = new int[1000];
//
//            for (int i = 0; i < 1000; i++) {
//                arr[i] = i + 1;
//            }
//
//            this.intSet = arr;
//            this.integerArrayList = new ArrayList<>();
//            integerArrayList.add(null);
//
//
//        }
//
//        public int popSmallest() {
//            for (int i = 0; i < intSet.length; i++) {
//                if (intSet[i] > 0) {
//                    integerArrayList.add(intSet[i]);
//                    intSet[i] = 0;
//                    return i + 1;
//                }
//            }
//            return -9999;
//
//        }
//
//        public void addBack(int num) {
//            num = num - 1;
//            integerArrayList.add(null);
//            if (intSet[num] == 0) {
//                intSet[num] = num + 1;
//            }
//        }
//
//
////    public static void main(String[] args) {
////
////        SmallestInfiniteSet obj = new SmallestInfiniteSet();
////
////
////        obj.addBack(2);
////        obj.popSmallest();
////        obj.popSmallest();
////        obj.popSmallest();
////        obj.addBack(1);
////        obj.popSmallest();
////        obj.popSmallest();
////        obj.popSmallest();
////
////    }
//    }
//
///**
// * Your SmallestInfiniteSet object will be instantiated and called as such:
// * SmallestInfiniteSet obj = new SmallestInfiniteSet();
// * int param_1 = obj.popSmallest();
// * obj.addBack(num);
// */
//
//
//
//}
