package massivePractice;

public class Massiv {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for(int a = 0; a < arr.length;a++){
            if(a%2 == 0){
                continue;
            }
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for(int a = arr.length -1; a >=0 ;a--){
            if(a%2 == 0){
                continue;
            }
            System.out.println(a + " ");
        }
        }
    }

