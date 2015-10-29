package org.mca.school.core.persist;

import org.mca.school.core.entity.AbstractAuditableEntity;
import org.mca.school.core.entity.AbstractEntity;
import org.mca.school.core.entity.Audit;
import org.mca.school.core.entity.Entity;
import org.mca.school.core.exception.AppException;
import org.mca.school.core.exception.ValidationException;
import org.mca.school.core.util.GSDKUtil;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * Persistence
 * Created by Hussain on 10/19/15.
 */
public class EntityPersistence {
    public static <T extends AbstractEntity> T create (T e) throws AppException {
        //Set Id and Audit Information
        Entity eAnnot = e.getClass().getAnnotation(Entity.class);
        String prefix = eAnnot.prefix();
        e.setId(UUID.randomUUID().toString());
        if (e instanceof AbstractAuditableEntity) {
            setCreateAudit((AbstractAuditableEntity) e);
        }

        validate(e);

        return null;
    }

    public static <T extends AbstractEntity> T update (T e) throws AppException {
        //Set Audit Information
        if (e instanceof AbstractAuditableEntity) {
            setUpdateAudit(((AbstractAuditableEntity) e).getAuditDetail());
        }

        validate(e);

        return null;
    }

    public static <T extends AbstractEntity> T restore (String id) throws AppException {
        return null;
    }

    public static <T extends AbstractEntity> void delete (T e) throws AppException {

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

    private static <T extends AbstractEntity> void validate(T e) throws ValidationException {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(e);
        if (violations != null && violations.size() > 0) {
            String error[] = new String[violations.size()];
            int cnt = 0;
            for (ConstraintViolation<T> violation : violations) {
                String propertyPath = violation.getPropertyPath().toString();
                String message = violation.getMessage();
                error[cnt++] = propertyPath + ":" + message;
            }
            throw new ValidationException(error);
        }

    }
}
