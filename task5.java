package massivePractice;

public class task5{
    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i = i + 2) {
            mas[i] = i + 2;
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < mas.length; i = i + 2) {
            mas[i] = i + 2;
            System.out.println(mas[i]);
        }
    }
}
