package algorithms.TwoPointer;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        //Case 1
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("result 1 = " + Arrays.toString(result));

        //Case 2
        nums = new int[]{3,2,4};
        target = 6;

        result = twoSum(nums, target);
        System.out.println("result 2 = " + Arrays.toString(result));

        //Case 3
        nums = new int[]{3,3};
        target = 6;

        result = twoSum(nums, target);
        System.out.println("result 3 = " + Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){;
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("No combination found");
    }
}
