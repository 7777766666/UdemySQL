package com.example.demo.coducation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSumClosest {

    public static void main(String[] args) {

        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int[] nums = {4, 0, 5, -15, 2, 3, 0, -4, -5, 90};
//        int[] nums = {559,-803,634,339,-907,594,95,-90,367,623,-264,262,-67,320,-373,430,-189,546,-475,-512,929,-377,770,936,-517,256,-106,234,675,111,-124,595,104,-266,-797,55,-937,-655,-354,-202,-489,379,-61,853,275,316,-322,-215,529,-774,-406,-507,633,-935,-263,600,992,-641,639,-258,81,175,-567,454,-794,-428,-620,980,-419,-288,534,841,-82,-526,574,21,-502,375,-218,-727,-100,823,-206,-737,-217,-625,-910,939,-906,382,-25,750,-825,476,407,365,920,-880,-770,-532,446,-562,371,372,-852,-18,-496,65,659,447,-296,774,572,827,637,-60,-768,550,955,-550,184,-424,892,609,516,728,-835,743,283,601,960,-179,-951,202,-230,422,354,-21,156,294,425,973,148,-144,694,-44,-316,17,-178,-187,587,-668,11,-881,-180,-277,380,233,-575,543,-685,-499,-872,749,-757,66,-656,-744,-265,477,-407,-720,-682,-678,-578,-290,-29,988,168,313,-487,560,-688,24,-814,-836,169,578,724,-110,862,640,-368,75,976,-531,647,-843,795,-597,-650,693,506,635,72,-684,-346,648,-169,-254,351,404,-850,731,-534,-561,690,483,-585,-994,965,604,-170,688,-736,147,959,-335,763,494,-747,378,181,-669,-112,-455,-383,-764,-382,652,-69,319,-654,626,950,-961,-392,677,-303,-375,-621,-553,-903,-717,-555,-412,248,-586,513,-828,721,851,295,-709,768,-713,933,937,340,321,670,597,804,890,209,-399,-462,-598,666,625,-813,-610,176,870,-17,641,329,843,376,863,82,716,-219,-510,-638,-552,-214,-596,-703,440,683,944,164,388,-76,755,583,916,303,854,-283,413,575,-213,-423,833,68,-185,610,-911,-102,-795,-363,-895,-222,-571,237,42};
        int target = 68;
        System.out.println(" Target = " + target);

        System.out.println((threeSumClosest.threeSumClosest(nums, target)) + "  result");
    }


    public int threeSumClosest(int[] nums, int target) {

        int length = nums.length;
        if (length == 3) return nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        if (nums[0] + nums[1] + nums[2] > target) return nums[0] + nums[1] + nums[2];
        if (nums[length - 1] + nums[length - 2] + nums[length - 3] < target)
            return nums[length - 1] + nums[length - 2] + nums[length - 3];

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        return target;
                    }
                    set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        TreeSet<Integer> integerSet = new TreeSet<>(set);
        Integer higher = integerSet.ceiling(target);
        Integer lower = integerSet.floor(target);
        int higher1 = Math.abs(higher - target);
        int lower1 = Math.abs(lower - target);
        return (higher1 > lower1) ? lower : higher;

// The second method is lower, but it is the same in speed.

//        Object[] toArray = set.toArray();
//        Arrays.sort(toArray);
//
//        int[] finish = new int[set.size()];
//        for (int i = 0; i < set.size(); i++) {
//            finish[i] = (int) toArray[i];
//        }

//        for (int i = 1; i < finish.length; i++) {
//            if (finish[i] > target) {
//
//                int second = Math.abs(finish[i] - target);
//                int first = Math.abs(finish[i - 1] - target);
//                return (first > second) ? finish[i] : finish[i - 1];
//            }
//        }

    }
}