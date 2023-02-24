public class Exer2 {
    public static void main(String[] args) {
        String[] names = {
                "Alex", "Drake", "Anya", "leon", "Adam"
        };
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
            if (name.indexOf("A") == 0) {
                System.out.println(name);
                if (name.charAt(0) == 'A') {
                    System.out.println(name);
                }
            }
        }
    }
}