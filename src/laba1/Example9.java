package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number_of_daysinmonth = 0;
       String MonthOfName = "Unknown";
        System.out.println("Input a month number");
        int month = in.nextInt();
        System.out.println("Input a year");
        int year = in.nextInt();


        switch (month) {
            case 1:
                MonthOfName = "Январь";
                number_of_daysinmonth = 31;
                break;
            case 2:
                MonthOfName = "Февраль";
                        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                number_of_daysinmonth = 29;
            } else {
                            number_of_daysinmonth = 28;
                        }
                        break;
            case 3:
            MonthOfName = "Март";
            number_of_daysinmonth = 31;
            break;
            case 4:
                MonthOfName = "Апрель";
                number_of_daysinmonth = 30;
                break;
            case 5:
                MonthOfName = "Май";
                number_of_daysinmonth = 31;
                break;
            case 6:
            MonthOfName = "Июнь";
            number_of_daysinmonth = 30;
            break;
            case 7:
                MonthOfName = "Июль";
                number_of_daysinmonth = 31;
                break;
            case 8:
                MonthOfName = "Август";
                number_of_daysinmonth = 31;
                break;
            case 9:
                MonthOfName = "Сентябрь";
                number_of_daysinmonth = 30;
                break;
            case 10:
                MonthOfName = "Октябрь";
                number_of_daysinmonth = 31;
                break;
            case 11:
                MonthOfName = "Ноябрь";
                number_of_daysinmonth = 30;
                break;
            case 12:
                MonthOfName = "Декабрь";
                number_of_daysinmonth = 31;
                break;
        }
        System.out.println(MonthOfName + " " + year + "has" + number_of_daysinmonth + "days\n");
    }
}
