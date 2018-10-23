package ru.shumilov.ia.calendar;

import java.util.Calendar;

public class Week {

    public static void getDay() {

        final int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        boolean flag = false;

        switch (day) {
            case Calendar.MONDAY:
                System.out.print("Вторник");
                flag = true;
            case Calendar.TUESDAY:
                if (flag) {
                    System.out.print(", ");
                }
                System.out.print("Среда");
                flag = true;
            case Calendar.WEDNESDAY:
                if (flag) {
                    System.out.print(", ");
                }
                System.out.print("Четверг");
                flag = true;
            case Calendar.THURSDAY:
                if (flag) {
                    System.out.print(", ");
                }
                flag = true;
                System.out.print("Пятница");
            case Calendar.FRIDAY:
                if (flag) {
                    System.out.print(", ");
                }
                flag = true;
                System.out.print("Суббота");
            case Calendar.SATURDAY:
                if (flag) {
                    System.out.print(", ");
                }
                System.out.println("Воскресенье");
                break;
            case Calendar.SUNDAY:
                System.out.println("Последний день");
                break;
        }
    }
}
