package org.mca.school.party.entity;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "stdnt")
public class Student extends AbstractAuditableEntity {
    private String name;
    private String parentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
