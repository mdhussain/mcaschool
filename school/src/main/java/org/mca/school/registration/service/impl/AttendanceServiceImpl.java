package org.mca.school.registration.service.impl;

import org.mca.school.core.exception.AppException;
import org.mca.school.core.persist.EntityPersistence;
import org.mca.school.registration.entity.Attendance;
import org.mca.school.registration.service.AttendanceService;

/**
 * Created by Hussain on 10/19/15.
 */
public class AttendanceServiceImpl implements AttendanceService {
    @Override
    public Attendance create(Attendance attendance) throws AppException {
        return EntityPersistence.create(attendance);
    }

    @Override
    public Attendance update(Attendance attendance) throws AppException {
        return EntityPersistence.update(attendance);
    }

    @Override
    public Attendance get(String id) throws AppException {
        return EntityPersistence.restore(id);
    }

    @Override
    public void delete(Attendance attendance) throws AppException {
        EntityPersistence.delete(attendance);
    }
}
