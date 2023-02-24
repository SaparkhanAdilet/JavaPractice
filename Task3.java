package massivePractice;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.print("the other half of the array: ");
        for (int i = nums.length / 2; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
