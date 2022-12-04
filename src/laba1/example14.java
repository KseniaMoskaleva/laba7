package laba1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input num1 = ");
        int w = in.nextInt();

        int c,d,s;
        c = w - 1;
        d = w + 1;
        s = (w + c + d) * 2;

        System.out.printf(("%d, %d, %d, %d"), w, c, d, s);
        in.close();
    }
}