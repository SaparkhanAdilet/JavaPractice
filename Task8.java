package massivePractice;

public class Task8 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        int positivecount = 0;
        int negativecount = 0;
        for (int num : nums){
            if(num > 0){
                positivecount++;
            }else{
                negativecount++;
            }
        }
        System.out.println("positivecount: " + positivecount);
        System.out.println("negativecount: " + negativecount);
    }
}
