import java.util.Scanner;

public class StarPyramid2 {
    public static void main(String[] args) {
        System.out.print("Enter value of n:- ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
