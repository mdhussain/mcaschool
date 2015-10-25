package org.mca.school.registration.service.impl;

import org.mca.school.core.exception.AppException;
import org.mca.school.core.persist.EntityPersistence;
import org.mca.school.registration.entity.Registration;
import org.mca.school.registration.service.RegistrationService;

/**
 * Created by Hussain on 10/16/15.
 */
public class RegistrationServiceImpl implements RegistrationService {
    @Override
    public Registration create(Registration registration) throws AppException {
        return EntityPersistence.create(registration);
    }

    @Override
    public Registration update(Registration registration) throws AppException {
        return EntityPersistence.update(registration);
    }

    @Override
    public Registration get(String id) throws AppException {
        return EntityPersistence.restore(id);
    }

    @Override
    public void delete(Registration registration) throws AppException {
        EntityPersistence.delete(registration);
    }
}
