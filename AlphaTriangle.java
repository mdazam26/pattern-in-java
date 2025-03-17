public class AlphaTriangle {
    public static void main(String[] args) {
//        char a ;
        for(int i = 0;i < 4; i++){
            for (int j = 0, a = 65; j < i+1; j++, a ++){
                System.out.print((char)a+ " ");
            }
            System.out.println();
        }
    }
}
