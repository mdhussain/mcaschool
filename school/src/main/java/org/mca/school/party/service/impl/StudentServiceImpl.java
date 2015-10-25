package org.mca.school.party.service.impl;

import org.mca.school.core.exception.AppException;
import org.mca.school.core.persist.EntityPersistence;
import org.mca.school.party.entity.Student;
import org.mca.school.party.service.StudentService;

/**
 * Created by Hussain on 10/19/15.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public Student create(Student stud) throws AppException {
        return EntityPersistence.create(stud);
    }

    @Override
    public Student update(Student stud) throws AppException {
        return EntityPersistence.update(stud);
    }

    @Override
    public Student get(String id) throws AppException {
        return EntityPersistence.restore(id);
    }

    @Override
    public void delete(Student stud) throws AppException {
        EntityPersistence.delete(stud);
    }
}
