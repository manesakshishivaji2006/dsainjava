class Pattern1 {
    public static void main(String[] args) {

        // Outer loop → rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop → columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
