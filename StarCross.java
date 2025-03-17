import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter odd number eg: 3,5,7 : ");
        int n = input.nextInt();

        for(int i = n , a = 1; i > 0 ; i--,a++){
            for(int j = 1; j <= n; j++){
                if(i == j) {
                    System.out.print(" * ");
                }
                else if(a == j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
    }
}
