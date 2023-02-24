public class Exer1 {
    public static void main(String[] args) {
        String text = "application hello template";
        String word = "hello";
        boolean got = text.contains(word);
        System.out.println(got);

        System.out.println();

        int b = text.indexOf(word);
        if (b == 12){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(b);
    }
}
