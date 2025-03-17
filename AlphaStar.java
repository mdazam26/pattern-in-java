import java.util.Scanner;

public class AlphaStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n:- ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");
            int a = 65;
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print((char)a);
                a++;
            }

            System.out.println();
        }
    }
}
