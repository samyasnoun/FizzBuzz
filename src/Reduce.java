public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int x = 0;
        while (n != 0){
            if (n % 2 == 0) {
                n /= 2;
            }else if (n % 2 == 1){
                n = n - 1;
                }
            x++;

            }
        System.out.println(x);
        }

    }

