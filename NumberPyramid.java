import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n:- ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print(j );
            }
//            if( i >= 2){
                for(int j = 1, a = i -1; j <= i-1 ; j++, a--) {
                    System.out.print(a);
                }
//            }
            System.out.println();
        }
    }
}
