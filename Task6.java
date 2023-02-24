package massivePractice;

public class Task6 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.print("The last 3 elements in array:");
        for (int i = nums.length - 3; i < nums.length; i++){
            System.out.print(" " + nums[i]);
        }
    }
}
