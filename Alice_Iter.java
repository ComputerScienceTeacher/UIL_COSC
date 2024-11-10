public class Alice_Iter {
    public static void main(String[] args) {
        // Draw the sail
        for (int i = 1; i <= 3; i++) {
            System.out.println(" ".repeat(14) + "&".repeat(i));
        }

        // Draw the sail with increasing dashes
        for (int i = 4; i <= 20; i++) {
            System.out.println(" ".repeat(14) + "&&" + "-".repeat(i - 3) + "&");
        }

        // Draw Alice waving from the sailboat
        System.out.println(" ".repeat(15) + "||" + " ".repeat(19) + "\\o/");
        System.out.println(" ".repeat(15) + "||" + " ".repeat(20) +  "|");

        // Draw the water and the boat
        System.out.println("     ======================================");
        System.out.println("       ==================================");
        System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}