package org.mca.school.party.service;

import org.mca.school.base.entity.ClassRoom;
import org.mca.school.core.exception.AppException;
import org.mca.school.party.entity.Instructor;

/**
 * Created by Hussain on 10/16/15.
 */
public interface InstructorService {
    Instructor create(Instructor instructor) throws AppException;

    Instructor update(Instructor instructor) throws AppException;

    ClassRoom get(String id) throws AppException;

    void delete(Instructor instructor) throws AppException;
}
