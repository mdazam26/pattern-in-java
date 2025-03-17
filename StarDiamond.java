import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n in (odd) :- ");
        int n = input.nextInt();
        int ml = n/2 + 1;
        int nsp =  n/2;
        int nst = 1;

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= nsp; k++)
                System.out.print(" ");


            for (int k = 1; k <= nst; k++)
                System.out.print("*");

            if(i < ml){
                nsp--;
                nst+=2;
            }
            else {
                nsp++;
                nst-=2;
            }

            System.out.println();
        }
    }
}
