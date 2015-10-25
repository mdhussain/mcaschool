package org.mca.school.party.service.impl;

import org.mca.school.base.entity.ClassRoom;
import org.mca.school.core.exception.AppException;
import org.mca.school.core.persist.EntityPersistence;
import org.mca.school.party.entity.Instructor;
import org.mca.school.party.service.InstructorService;

/**
 * Created by Hussain on 10/16/15.
 */
public class InstructorServiceImpl implements InstructorService {
    @Override
    public Instructor create(Instructor instructor) throws AppException {
        return EntityPersistence.create(instructor);
    }

    @Override
    public Instructor update(Instructor instructor) throws AppException {
        return EntityPersistence.update(instructor);
    }

    @Override
    public ClassRoom get(String id) throws AppException {
        return EntityPersistence.restore(id);
    }

    @Override
    public void delete(Instructor instructor) throws AppException {
        EntityPersistence.delete(instructor);
    }
}
