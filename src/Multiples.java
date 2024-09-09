public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        // Loop through numbers from 1 to 999
        for (int i = 1; i < 1000; i++) {
            // Check if the number is a multiple of 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                count++; // Increment count if it is
            }
        }

        // Print the total count
        System.out.println(count);

    }
}
