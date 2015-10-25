package org.mca.school.web;


import com.googlecode.objectify.ObjectifyService;
import org.mca.school.core.entity.Entity;
import org.reflections.Reflections;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Set;

/**
 * Created by Hussain on 10/21/15.
 */
public class OfyHelper implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        // This will be invoked as part of a warmup request, or the first user request if no warmup
        // request.
        Reflections reflections = new Reflections("org.mca.school");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(Entity.class);
        for (Class<?> aClass : annotated) {
            ObjectifyService.register(aClass);
        }
    }

    public void contextDestroyed(ServletContextEvent event) {
        // App Engine does not currently invoke this method.
    }
}
