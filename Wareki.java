package Procon;

import java.util.Scanner;

public class Wareki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wareki = sc.next();

        char str = wareki.charAt(0); //一文字目
        String str2 = wareki.substring(1); //二文字目以降
        int s = Integer.parseInt(str2); //二文字目以降の数字変換

        if (str == 'M') {
            System.out.println(1868 + s - 1);
        }
        if (str == 'T') {
            System.out.println(1912 + s - 1);
        }
        if (str == 'S') {
            System.out.println(1926 + s - 1);
        }
        if (str == 'H') {
            System.out.println(1989 + s - 1);
        }
        if (str == 'X') {
            System.out.println(2019 + s - 1);
        }

    }

}
