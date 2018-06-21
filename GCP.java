package Procon;

import java.util.Scanner;

public class GCP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String janken = sc.next();
        //String ans = janken;

        if (janken.contains("GC|CP|PG")) {
            for (int i = janken.length(); i >= 0; i--) {
                String ans = janken.replaceAll("GC|CP|PG", "");
                //System.out.println(ans);
                janken = ans;
                System.out.println(janken);
            }
            //System.out.println(janken);
        }

    }

}
