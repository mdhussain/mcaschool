package org.mca.school.base.entity;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

import java.util.List;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "class")
public class ClassRoom extends AbstractAuditableEntity {
    private String roomNo;
    private Program program;
    private List<Period> periods;
    private Schedule schedule;

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
