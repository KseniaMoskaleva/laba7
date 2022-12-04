package laba1;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Example10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year: ");
        int year = in.nextInt();
         int d = 0;
         d = 2022 - year;
        System.out.printf(("Your age: %d \n"), d);
        in.close();
            }
}
