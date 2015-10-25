package org.mca.school.registration.service;

import org.mca.school.core.exception.AppException;
import org.mca.school.registration.entity.Registration;

/**
 * Created by Hussain on 10/16/15.
 */
public interface RegistrationService {
    Registration create(Registration registration) throws AppException;

    Registration update(Registration registration) throws AppException;

    Registration get(String id) throws AppException;

    void delete(Registration registration) throws AppException;
}
