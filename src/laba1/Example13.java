package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int o;


        System.out.println("number1 = ");
        int e = in.nextInt();

        System.out.println("number2 = ");
        int k = in.nextInt();

        o = e + k;

        System.out.printf(("Сумма = %o"), o);
        in.close();
    }
}
