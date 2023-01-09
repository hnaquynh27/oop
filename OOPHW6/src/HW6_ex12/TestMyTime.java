package HW6_ex12;

public class TestMyTime {
    public static void main(String[] args) {

        MyTime midnight = new MyTime();
        System.out.println(midnight.toString());
        System.out.println("The next second is: " + midnight.nextSecond());
        System.out.println("The next min is: " + midnight.nextMinute());
        System.out.println("The next hour is: " + midnight.nextHour());

        MyTime wakeup = new MyTime(6, 0, 0);
        System.out.println("The previous second is: " + wakeup.previousSecond());
        System.out.println("The previous min is: " + wakeup.previousMinute());
        System.out.println("The previous hour is: " + wakeup.previousHour());

    }
}
