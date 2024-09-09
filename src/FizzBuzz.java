/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//                System.out.println("Fizz Buzz");
//            } else if (divisibleBy3) {
//                System.out.println("Fizz");
//            } else if (divisibleBy5) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}
        int i = 1;
        while (i < 100){
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean div_by_3 = i % 3 == 0;
        boolean div_by_5 = i % 5 == 0;
        if (div_by_3 && div_by_5){
        System.out.println("FizzBuzz");
        } else if (div_by_3){
            System.out.println("Fizz");
        } else if (div_by_5){
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
