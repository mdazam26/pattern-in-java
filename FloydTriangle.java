import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();

        int a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i;j++,a++){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        // for odd
        System.out.print("Enter value of n for odd:- ");
        n = input.nextInt();

        a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(a + " ");
                a+=2;
            }
            System.out.println();
        }
    }
}
