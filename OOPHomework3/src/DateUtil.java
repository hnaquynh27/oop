
public class DateUtil {
    public static String[] strMonths
            = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static void main(String[] args) {
        System.out.println(isLeapYear(1975));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2099, 13, 31));
        System.out.println(isValidDate(2012, 2, 29));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2012, 2, 17));


    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return year % 100 != 0;
        }
        return year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0 || year > 9999) {
            return false;
        }
        if (month < 0 || month > 12) {
            return false;
        }
        if (day < 0 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day <= 29)
                    return true;
            } else {
                if (day <= 28)
                    return true;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        return true;
    }

    static int getDayOfWeek(int year, int month, int day) {
        int centuryNum = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int yearNum = lastTwoDigitsOfYear / 4;
        int monthNum;
        if (isLeapYear(year)) {
            monthNum = leapYearMonthNumbers[month - 1];
        } else {
            monthNum = nonLeapYearMonthNumbers[month - 1];
        }
        int dayNum = day;
        int temp = (centuryNum + lastTwoDigitsOfYear + yearNum + monthNum + dayNum) % 7;
        return temp;
    }

    static String printDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Isn't a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
}
