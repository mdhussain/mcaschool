package org.mca.school.core.entity;

/**
 * Created by Hussain on 10/16/15.
 */
public interface IAuditAware {
    Audit getAuditDetail();
    void setAuditDetail (Audit audit);
}
