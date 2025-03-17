import java.sql.SQLOutput;
import java.util.Scanner;

public class AlphaPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print( "Enter value of N:- ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){

            for(int j = 1 ; j <= n-i; j++)
                System.out.print(" ");

            for(int j = 1,a = 65; j <= i; j++,a++)
                System.out.print((char)a);

            for(int j = 1, a = (65+ i - 2) ; j <= i -1; j++ , a--)
                System.out.print((char)a);

            System.out.println();
        }


    }
}
