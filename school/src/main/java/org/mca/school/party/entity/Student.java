package org.mca.school.party.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

import javax.validation.constraints.Size;

/**
 * Student representation
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "stdnt")
public class Student extends AbstractAuditableEntity {
    @NotEmpty
    @Size(min=2, max=50)
    private String name;

    @NotEmpty
    @Size(min=2, max=50)
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
