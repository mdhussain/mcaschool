package org.mca.school.base.entity;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "subjt")
public class Subject extends AbstractAuditableEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
