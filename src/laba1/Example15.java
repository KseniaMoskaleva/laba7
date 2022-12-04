package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input num1 = ");
        int num1 = in.nextInt();
        System.out.println("Input num2 = ");
        int num2 = in.nextInt();

        int s,r;
        s = num1 + num2;
        r = num1 - num2;

        System.out.printf("Сумма чисел = " + s);
        System.out.printf("\nРазность чисел = " + r);
        in.close();
    }
}
