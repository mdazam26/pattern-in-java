import java.util.Scanner;

public class numberArc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = input.nextInt();
        int nsp = 1;
        int nst = n-1;
        for(int i = 1; i <= 2*n-1; i++)
            System.out.print(i);
        System.out.println();

        for(int i = 1; i < n; i++ ){
            int a = 1;
            for(int j = 1; j <= nst; j++){
                System.out.print(a);
                a++;
            }
            for(int j = 1; j <= nsp; j++){
                System.out.print(" ");
                a++;
            }

            for(int j = 1; j <= n-i; j++ ){
                System.out.print(a);
                a++;
            }

            nsp += 2;
            nst--;

            System.out.println();
        }


    }
}
