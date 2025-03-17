public class HourGlass2 {
        public static void main(String[] args) {
            int height = 5;

            // Upper part of the hourglass
            for (int i = height; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            // Lower part of the hourglass
            for (int i = 2; i <= height; i++) {
                // Print spaces
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

}
