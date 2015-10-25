package org.mca.school.core.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Hussain on 10/21/15.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
    String prefix();
}
