package oop.labor02;

public class DateUtil {



    public static boolean leapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }

    public static boolean isValidDate(int year, int month, int day)
    {
        if(year > 0) {
            if (month >= 1 && month <= 12) {
                if (month == 2) {
                    if (leapYear(year)) {
                        if (day >= 1 && day <= 29)
                            return true;
                    } else if (day >= 1 && day <= 28)
                        return true;

                } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day >= 1 && day <= 31)
                        return true;
                } else {
                    if (day >= 1 && day <= 30)
                        return true;
                }
            }
        }
        return false;
    }
}
