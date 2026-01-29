class Pattern6 {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = rows; i >= 1; i--) {

            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            // New line
            System.out.println();
        }
    }
}
