
import java.util.*;

public class capri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = scanner.nextInt();
        boolean isCapricorn = false;

        int square = n * n;
        int temp = square;
        int contDigits = 0;

        while (temp > 0) {
            contDigits++;
            temp /= 10;
        }

        for (int i = 1; i < contDigits; i++) {
            int divisor = (int) Math.pow(10, i);
            int quotient = square / divisor;
            int remainder = square % divisor;
            if (quotient + remainder == n) {
                isCapricorn = true;
            }
        }
        if (isCapricorn == true)
            System.out.println("Capricorn/Kaprekar number");

        else

            System.out.println("Not Capricorn/Kaprekar number");
    }
}