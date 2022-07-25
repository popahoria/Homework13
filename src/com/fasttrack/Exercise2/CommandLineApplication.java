package com.fasttrack.Exercise2;

import com.fasttrack.Exercise1.DailyPlanner;
import com.fasttrack.Exercise1.DaySchedule;
import com.fasttrack.Exercise1.DaysOfTheWeek;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CommandLineApplication {
    public static void main(String[] args) {

        List<DaySchedule> dayScheduleList = new LinkedList<>();
        dayScheduleList.add(new DaySchedule(new LinkedList<String>(Arrays.asList("go swimming", "job", "learn")), DaysOfTheWeek.MONDAY));

        DailyPlanner dailyPlanner = new DailyPlanner(dayScheduleList);

        showMenu();
        Scanner scanner = new Scanner(System.in);
        int chosenMenu = 0;
        String dayFromMenu = "";
        String activityFromMenu = "";
        Scanner dayScanner = new Scanner(System.in);

        do {
            chosenMenu = scanner.nextInt();
            if (chosenMenu == 1) {
                System.out.print("day: ");
                dayFromMenu = String.format("%s", dayScanner.next());
                System.out.print("activity: ");
                activityFromMenu = String.format("%s", dayScanner.next());
                dailyPlanner.addActivity(DaysOfTheWeek.valueOf(dayFromMenu), activityFromMenu);
                System.out.println(dailyPlanner);
            } else if (chosenMenu == 2) {
                System.out.print("day: ");
                dayFromMenu = String.format("%s", dayScanner.next());
                System.out.print("activity: ");
                activityFromMenu = String.format("%s", dayScanner.next());
                dailyPlanner.removeActivity(DaysOfTheWeek.valueOf(dayFromMenu), activityFromMenu);
                System.out.println(dailyPlanner);
            } else if (chosenMenu == 3) {
                System.out.print("day: ");
                dayFromMenu = String.format("%s", dayScanner.next());
                System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.valueOf(dayFromMenu)));
            } else if (chosenMenu == 4) {
                System.out.println(dailyPlanner.endPlanning());
                break;
            } else {
                System.out.println("Please select a valid option");
            }
            showMenu();
        } while (chosenMenu != 4);
    }

    public static void showMenu() {
        System.out.println(" 1) add an activity");
        System.out.println(" 2) remove an activity");
        System.out.println(" 3) list all activities");
        System.out.println(" 4) end planning");
    }
}


