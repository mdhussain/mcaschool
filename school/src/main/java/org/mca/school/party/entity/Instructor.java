package org.mca.school.party.entity;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.Entity;

/**
 * Created by Hussain on 10/16/15.
 */
@Entity(prefix = "instr")
public class Instructor extends AbstractAuditableEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
