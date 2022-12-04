package laba1;

import java.util.Scanner;

public class Example12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();
        int d = 0;
        d = 2022 - age;
        System.out.printf(("Your birth year: %d \n"), d);
        in.close();
    }
}
