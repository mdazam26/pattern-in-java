import java.util.Scanner;

public class StarArc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n = input.nextInt();
        int nsp = 1;
        int nst = n-1;

        for (int i = 1; i<= (2*n-1); i++)
            System.out.print("*");

        System.out.println();
        for(int i = 1; i < n; i++){


            for(int j = 1 ; j <= nst; j++){
                System.out.print("*");
            }

            for (int j = 1; j <= nsp; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++){
                System.out.print("*");
            }
            nsp+=2;
            nst--;

            System.out.println();
        }

    }
}
