package com.fasttrack.Exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner extends DaySchedule{
    private List<DaySchedule> dayScheduleList;



    public DailyPlanner(List<DaySchedule> daySchedules) {
        this.dayScheduleList = daySchedules;
    }



    public void addActivity(DaysOfTheWeek days, String activity){
        if( activity == null){
            try {
                throw new uncheckedNoActivityException("NoActivityException");
            } catch (uncheckedNoActivityException e) {
                e.printStackTrace();
            }
        }
        for(DaySchedule daySchedule : dayScheduleList){
            if(daySchedule.getDay().equals(days)){
                (daySchedule.getActivities()).add(activity);
            }
        }
    }

    public void removeActivity(DaysOfTheWeek day, String activity) {
        if(activity==null){
            try {
                throw new uncheckedNoActivityException("NoActivityException");
            } catch (uncheckedNoActivityException e) {
                e.printStackTrace();
            }
        }

        for(DaySchedule daySchedule : dayScheduleList){
            if((daySchedule.getDay()).equals(day)){
                if(daySchedule.getActivities().contains(activity)){
                    daySchedule.getActivities().remove(activity);
                }else{
                    System.out.println(String.format("%s don't belong to %s list of activities!", activity, day));
                }
            }
        }
    }

    public List<String>getActivities(DaysOfTheWeek day){
        List<String> result = new ArrayList<>();
        for(DaySchedule daySchedule : dayScheduleList){
            if((daySchedule.getDay()).equals(day)){
                result = daySchedule.getActivities();
            }
        }
        return result;
    }


    public Map<DaysOfTheWeek, List<String>> endPlanning()  {
        Map<DaysOfTheWeek, List<String>> result =new HashMap<>();
        try{
            for(DaySchedule daySchedule : dayScheduleList){
                if((daySchedule.getActivities()).isEmpty()){
                    throw new uncheckedNoActivityException("NoActivityException");
                }
            }
        }catch (uncheckedNoActivityException e){
            System.out.println("day has no activities ");
        }finally{
            for(DaySchedule daySchedule : dayScheduleList){
                result.put(daySchedule.getDay(), daySchedule.getActivities());
            }
        }

        return result;
    }




    class uncheckedNoActivityException extends Throwable {
        private final String activity;

        uncheckedNoActivityException(String activity) {
            this.activity = activity;
        }

        public String getActivity(){
            return getActivity();
        }
    }



    @Override
    public String toString() {
        return "DailyPlanner{" +
                "dayScheduleList=" + dayScheduleList +
                '}';
    }
}
