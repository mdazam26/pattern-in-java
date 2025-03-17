import java.util.Scanner;
public class StarPyramid3 {
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // Build the pyramid
        for (int i = 1; i <= n; i++) {
            // Print spaces (optimized single loop)
            System.out.print(" ".repeat(n - i));

            // Print stars (optimized single loop)
            System.out.print("*".repeat((2 * i) - 1));

            // Move to the next line after printing one row
            System.out.println();
        }
    }
}
