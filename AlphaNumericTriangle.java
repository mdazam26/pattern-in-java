public class AlphaNumericTriangle {
    public static void main(String[] args) {
//        char a ;
        for(int i = 1;i < 6; i++){
            for (int j = 1, a = 65; j < i+1; j++, a ++){
                if( i % 2 != 0)
                        System.out.print(j + " ");
                else
                    System.out.print((char)a+ " ");
            }
            System.out.println();
        }
    }
}
