package exercise88;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise88 {
    public static void main(String[] args) {
        //Case 1
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

        //Case 2
        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;

        merge(nums1, m, nums2, n);

        //Case 3
        nums1 = new int[]{0};
        nums2 = new int[]{1};
        m = 0;
        n = 1;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> nums1List = Arrays.stream(nums1).boxed().toList().subList(0, m);
        List<Integer> nums2List = Arrays.stream(nums2).boxed().toList().subList(nums2.length - n, nums2.length);

        List<List<Integer>> mergedList = new ArrayList<>();
        mergedList.add(nums1List);
        mergedList.add(nums2List);

        Stream<Integer> mergedStream = mergedList.stream().flatMap(collection -> collection.stream());

        List<Integer> sortedList = mergedStream.sorted().toList();
        for (int i = 0; i < nums1.length; i++){
            nums1[i] = sortedList.get(i);
        }
        System.out.println(Arrays.toString(nums1));
    }
}
