package org.mca.school.core.persist;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.AbstractEntity;
import org.mca.school.core.entity.Audit;
import org.mca.school.core.entity.Entity;
import org.mca.school.core.util.GSDKUtil;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Hussain on 10/19/15.
 */
public class EntityPersistence {
    public static <T extends AbstractEntity> T create (T e){
        //Set Id and Audit Information
        Entity eAnnot = e.getClass().getAnnotation(Entity.class);
        String prefix = eAnnot.prefix();
        e.setId(prefix + UUID.randomUUID());
        if (e instanceof AbstractAuditableEntity) {
            setCreateAudit((AbstractAuditableEntity) e);
        }
        return null;
    }

    public static <T extends AbstractEntity> T update (T e){
        //Set Audit Information
        if (e instanceof AbstractAuditableEntity) {
            setUpdateAudit(((AbstractAuditableEntity) e).getAuditDetail());
        }
        return null;
    }

    public static <T extends AbstractEntity> T restore (String id){
        return null;
    }

    public static <T extends AbstractEntity> void delete (T e){

    }

    private static void setCreateAudit(AbstractAuditableEntity ae) {
        Audit a = new Audit();
        a.setCreatedBy(GSDKUtil.getLoggedInUser());
        a.setCreatedOn(new Date());
        a.setUpdatedBy(GSDKUtil.getLoggedInUser());
        a.setUpdatedOn(new Date());
        ae.setAuditDetail(a);
    }

    private static void setUpdateAudit(Audit a) {
        a.setUpdatedBy(GSDKUtil.getLoggedInUser());
        a.setUpdatedOn(new Date());
    }
}
