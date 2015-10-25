package org.mca.school.base.entity;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

import java.util.List;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "progm")
public class Program extends AbstractAuditableEntity {

    private String name;
    private String level;
    private Double fees;
    private List<Subject> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
