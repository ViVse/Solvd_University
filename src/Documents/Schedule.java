package Documents;

import Documents.Lecture;
import Enums.DayOfTheWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private Map<DayOfTheWeek, ArrayList<Lecture>> schedule = new HashMap<DayOfTheWeek, ArrayList<Lecture>>();

    public Schedule() { }

    public Schedule(Map<DayOfTheWeek, ArrayList<Lecture>> schedule) {
        this.schedule = schedule;
    }

    public void addLecture(DayOfTheWeek day, Lecture lecture) {
        if (schedule.get(day) == null) {
            schedule.put(day, new ArrayList<Lecture>());
        }
        schedule.get(day).add(lecture);
    }

    @Override
    public String toString() {
        String info = "Documents.Schedule: ";
        for (Map.Entry<DayOfTheWeek, ArrayList<Lecture>> set :
                schedule.entrySet()) {
            info += "\n" + set.getKey() + ":";
            for(Lecture lecture : set.getValue()) {
                info += "\n\t" + lecture.toString();
            }
        }
        return info;
    }
}
