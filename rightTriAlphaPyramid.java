public class rightTriAlphaPyramid {
    public static void main(String[] args) {
        int n = 4;
       int a = 65;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)a+ " ");
            }
            a++;
            System.out.println();
        }
        a -= 2;

        for(int i = n-1; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print((char)a + " ");
            }
            a--;
            System.out.println();
        }
    }
}
