package HW6_ex12;

public class MyTime {
    private int hour = 0, minute = 0, second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "\"" + hour + ":" + minute + ":" + second + '\"';
    }

    public MyTime nextSecond() {
        try {
            setTime(hour, minute, ++second);
            return this;
        } catch (Exception e) {
        }
        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute() {
        try {
            setTime(hour, ++minute, second);
            return this;
        } catch (Exception e) {
        }
        minute = 0;
        return nextHour();
    }

    public MyTime nextHour() {
        try {
            setTime(++hour, minute, second);
            return this;
        } catch (Exception e) {
        }
        hour = 0;
        return this;
    }

    public MyTime previousSecond() {
        try {
            setTime(hour, minute, --second);
            return this;
        } catch (Exception e) {
        }
        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute() {
        try {
            setTime(hour, --minute, second);
            return this;
        } catch (Exception e) {
        }
        minute = 59;
        return previousHour();
    }

    public MyTime previousHour() {
        try {
            setTime(--hour, minute, second);
            return this;
        } catch (Exception e) {
        }
        hour = 23;
        return this;
    }

}
