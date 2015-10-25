package org.mca.school.base.entity;

import org.mca.school.party.entity.Instructor;

/**
 * Created by Hussain on 10/16/15.
 */
public class Period {
    private Subject subject;
    private Instructor instructor;
    private int hour = -1;
    private int minute = -1;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getTime() {
        return hour + ":" + minute;
    }

    public void setTime(String time) {
        if (time != null && !time.isEmpty() && time.contains(":")) {
            String str[] = time.split(":");
            try {
                hour = Integer.parseInt(str[0]);
                minute = Integer.parseInt(str[1]);
            }
            catch (NumberFormatException e)
            {
                hour = minute = -1;
            }
        }
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

}
