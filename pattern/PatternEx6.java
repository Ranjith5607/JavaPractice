package pattern;

public class PatternEx6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print(" " + i);
            if (i % 5 == 0) {
                System.out.println(" ");
            }
        }
    }
}
