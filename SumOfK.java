package Procon;

import java.util.Scanner;

public class SumOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        long answer = 0;
        if (K == 0) {
            System.out.println(0);
        } else if (K > B) {
            System.out.println(0);
        } else {

            for (long i = A; i < B; i++) {
                if (i % K == 0) {
                    answer += i;
                }
            }

            System.out.println(answer);

        }

    }

}
