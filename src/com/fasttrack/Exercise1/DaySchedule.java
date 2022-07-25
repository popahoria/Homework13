package com.fasttrack.Exercise1;

import java.util.List;

public class DaySchedule {
    private List<String> activities;
    private DaysOfTheWeek day;

    public DaySchedule(List<String> activities, DaysOfTheWeek day) {
        this.activities = activities;
        this.day = day;
    }

    public DaySchedule() {
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public void setDay(DaysOfTheWeek day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "activities=" + activities +
                ", days=" + day +
                '}';
    }
}

