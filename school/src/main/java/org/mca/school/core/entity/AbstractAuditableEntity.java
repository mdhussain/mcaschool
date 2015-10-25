package org.mca.school.core.entity;

/**
 * Created by Hussain on 10/16/15.
 */
public class AbstractAuditableEntity extends AbstractEntity implements IAuditAware {
    private Audit audit;

    @Override
    public Audit getAuditDetail() {
        return audit;
    }

    @Override
    public void setAuditDetail(Audit audit) {
        this.audit = audit;
    }
}
