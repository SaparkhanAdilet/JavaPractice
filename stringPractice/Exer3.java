public class Exer3 {
    public static void main(String[] args) {
        String text = "application hello transaction template";
        int a = text.indexOf(" ");
        String word = text.substring(0, a);
        String word2 = text.substring(text.lastIndexOf(" "));
        System.out.print(word);
        System.out.println(word2);

        for(int i = 0; i <= text.length(); i++){

        }
    }
}
