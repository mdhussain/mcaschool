package org.mca.school.registration.service;

import org.mca.school.core.exception.AppException;
import org.mca.school.registration.entity.Attendance;

/**
 * Created by Hussain on 10/19/15.
 */
public interface AttendanceService {
    Attendance create(Attendance attendance) throws AppException;

    Attendance update(Attendance attendance) throws AppException;

    Attendance get(String id) throws AppException;

    void delete(Attendance attendance) throws AppException;
}
