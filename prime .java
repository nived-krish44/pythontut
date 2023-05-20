import java.util.*;

class prime {
    public static void main(String args[]) {
        int flag = 0;
        for (int i = 0; i < 10; i++) {
            flag = 0;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    flag = 1;
                }
                // System.out.println("It is prime");
            }
            if (flag == 1) {
                System.out.println(i + "It is not prime");
            } else {
                System.out.println(i + "It is prime");
            }
        }
    }
}