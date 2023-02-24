public class Exer4 {
    public static void main(String[] args) {
        String text = "application hello transaction hello template";
        String word = "hello";

        int count = 0;
        for(int p = text.indexOf(word); p!=-1; p = text.indexOf(word,p + word.length())){
            count++;
        }
        System.out.println(count);
        }
    }

