package org.mca.school.registration.entity;

import org.mca.school.base.entity.ClassRoom;
import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;
import org.mca.school.party.entity.Student;

import java.util.Date;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "regst")
public class Registration extends AbstractAuditableEntity {
    private Student student;
    private ClassRoom classRoom;
    private Date registrationDate;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
