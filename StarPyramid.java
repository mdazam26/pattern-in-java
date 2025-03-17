// its not working properly
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();
        int y = (2*n) - 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= y+1; j++){
                if( j < n - i)
                    System.out.print(" ");
                else if (j >= n + i - 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
