package laba1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Example8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String day = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input year: ");
        int year = in.nextInt();

        System.out.printf("%s %s %d  \n", day, month, year);
        in.close();
    }
}
