package pattern;

public class PatternEx7 {


    public static void main(String[] args) {
        PatternEx7 patternEx7 = new PatternEx7();
        int k_A = 1;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(" " + k_A);
                k_A++;
            }
            System.out.println(" " + " ");
            System.out.println(patternEx7 instanceof PatternEx7);

        }
    }


}
