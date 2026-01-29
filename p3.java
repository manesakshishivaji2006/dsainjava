class Pattern4 {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = rows; i >= 1; i--) {

            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
