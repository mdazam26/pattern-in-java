import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = scanner.nextInt();
        for(int i = 1;i <= n;i++){
            boolean a = (i % 2 != 0);

            for (int j = 1; j <= i; j++){
                System.out.print(a ? 1 + " " : 0 + " ");
                a = !a;
            }
            System.out.println();
        }
        scanner.close();
    }
}
