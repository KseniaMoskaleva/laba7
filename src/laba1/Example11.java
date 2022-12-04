package laba1;

import java.util.Scanner;

public class Example11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input year: ");
        int year = in.nextInt();
        int d;
        d = 0;
        d = 2022 - year;
        System.out.printf(("Name: %s Age: %d \n"), name, d);
        in.close();
    }
}
