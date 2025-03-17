import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= ((2*n) - 1); j++){
                if(j <= n - i)
                    System.out.print(" ");
                else if (j <= (2*n)-i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
