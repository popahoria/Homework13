package com.fasttrack.Exercise1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DaySchedule> dayScheduleList = new LinkedList<>();
        dayScheduleList.add(new DaySchedule(new LinkedList<String>(Arrays.asList("go swimming", "job", "learn")), DaysOfTheWeek.MONDAY));
        dayScheduleList.add(new DaySchedule(new LinkedList<String>(Arrays.asList("be lazy, be lazy,be lazy,be lazy,be lazy")), DaysOfTheWeek.TUESDAY));

        DailyPlanner dayPlanner = new DailyPlanner(dayScheduleList);
        System.out.println(dayScheduleList);
        dayPlanner.addActivity(DaysOfTheWeek.MONDAY, "netflix & chill");
        System.out.println(dayScheduleList);
        dayPlanner.removeActivity(DaysOfTheWeek.MONDAY, "job");
        System.out.println(dayScheduleList);
        dayPlanner.removeActivity(DaysOfTheWeek.MONDAY, "jogging");
        System.out.println(dayPlanner);
        System.out.println(dayPlanner.getActivities(DaysOfTheWeek.TUESDAY));

    }

}
