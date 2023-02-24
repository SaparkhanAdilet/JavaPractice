package massivePractice;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Array: " + Arrays.toString(nums));
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            } else if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Max index: " + nums[maxIndex]);
        System.out.println("Min index: " + nums[minIndex]);
    }
}
