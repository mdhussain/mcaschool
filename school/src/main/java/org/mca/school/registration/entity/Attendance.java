package org.mca.school.registration.entity;

import org.mca.school.base.entity.ClassRoom;
import org.mca.school.base.entity.Period;
import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

import java.util.Date;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "attnd")
public class Attendance extends AbstractAuditableEntity {
    private Registration registration;
    private Date createdOn;
    private ClassRoom classRoom;
    private Period period;

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
