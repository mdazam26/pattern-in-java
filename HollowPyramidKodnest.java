public class HollowPyramidKodnest {
    public static void main(String[] args) {
        int n = 5;
        int end;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++){

                if(j == 1 || j == i )
                    System.out.print(" *");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                end = i - 1;
                if (i == 1 || j == 1 || j > end)
                    System.out.print(" *");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
