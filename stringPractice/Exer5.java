public class Exer5 {
    public static void main(String[] args) {
        String text = "application hello transaction template";
        String word = "hello";
        int b = text.indexOf(word);

        StringBuilder str = new StringBuilder(text);
        str.replace(b,b+5, "*****");
        System.out.println(str);

    }
}
