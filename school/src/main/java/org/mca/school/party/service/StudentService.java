package org.mca.school.party.service;

import org.mca.school.core.exception.AppException;
import org.mca.school.party.entity.Student;

/**
 * Created by Hussain on 10/19/15.
 */
public interface StudentService {
    Student create(Student stud) throws AppException;

    Student update(Student stud) throws AppException;

    Student get(String id) throws AppException;

    void delete(Student stud) throws AppException;
}
