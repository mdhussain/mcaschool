package org.mca.school.base.service;

import org.mca.school.base.entity.ClassRoom;
import org.mca.school.core.exception.AppException;

/**
 * Created by Hussain on 10/16/15.
 */
public interface ClassRoomService {
    ClassRoom create(ClassRoom room) throws AppException;
    ClassRoom update(ClassRoom room) throws AppException;
    ClassRoom get(String id) throws AppException;
    void delete(ClassRoom room) throws AppException;
}
