import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row : ");
        int row = scanner.nextInt();
        System.out.println("Enter column : ");
        int col = scanner.nextInt();
        for (int i = 1 ; i <= row;i++){
            for (int j = 1; j <= col; j++){
                if((i == 1 || j == 1) || (i == row || j == col))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
