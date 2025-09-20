package Homework;

public class WeekDays {
    public static void main(String[] args) {
        String[] week_days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Days of the week: " + week_days[0] + " " + week_days[1] + " " + week_days[2] +" " +
                week_days[3] +" " + week_days[4] + " " + week_days[5] + " " + week_days[6]);
        System.out.println("Odd indexes of days of the week: " + week_days[1] + " " + week_days[4] + " " + week_days[5]
                + " ");

        System.out.println("Even indexes of days of the week: " + week_days[0] + " " + week_days[2] + " " +
                week_days[4] + " " + week_days[6]);
    }
}
