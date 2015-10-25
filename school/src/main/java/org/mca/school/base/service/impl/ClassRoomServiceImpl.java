package org.mca.school.base.service.impl;

import org.mca.school.base.entity.ClassRoom;
import org.mca.school.base.service.ClassRoomService;
import org.mca.school.core.exception.AppException;
import org.mca.school.core.persist.EntityPersistence;

/**
 * Created by Hussain on 10/16/15.
 */
public class ClassRoomServiceImpl implements ClassRoomService {

    @Override
    public ClassRoom create(ClassRoom room) throws AppException {
        return EntityPersistence.create(room);
    }

    @Override
    public ClassRoom update(ClassRoom room) throws AppException {
        return EntityPersistence.update(room);
    }

    @Override
    public ClassRoom get(String id) throws AppException {
        return EntityPersistence.restore(id);
    }

    @Override
    public void delete(ClassRoom room) throws AppException {
        EntityPersistence.delete(room);
    }
}
