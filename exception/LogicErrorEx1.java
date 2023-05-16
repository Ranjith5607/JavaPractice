package exception;

public class LogicErrorEx1 {

    public static void main(String[] args) {
        int n = 5;
        int xor = 0;
        // Run the loop.
        int i;
        for (i = 1; i <= n; i++)
        {
            xor = xor ^ i;
        }
        System.out.println("Xor of all numbers is: " + xor);
    }
}


