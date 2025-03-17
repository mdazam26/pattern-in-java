import java.util.Scanner;

public class ZoomSquare2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = input.nextInt();
        int row = 2*n - 1;
        int col = 2*n - 1;
        int min = 0;
        int a ;
        int b ;
        for(int i = 1 ; i <= row ; i++) {
            for(int j = 1; j <= col; j++){
                if( i > n)
                    a = 2 * n - i;
                else
                    a = i;
                if ( j > n)
                    b = 2 * n - j;
                else
                    b = j;

                if(a < b)
                    min = a;
                else
                    min = b;

                if(i == row/2 + 1)
                    System.out.print(i);
                else if ( j == col/2 + 1)
                    System.out.print(j);
                else
                    System.out.print(min);
            }
            System.out.println();
        }
    }
}
