package org.mca.school.core.spring;

import org.mca.school.core.exception.AppException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hussain on 10/28/15.
 */
public class AppContext {
    private static AppContext _instance;
    private ApplicationContext context;

    private AppContext() {
        context = new ClassPathXmlApplicationContext("org/mca/school/core/spring/xml/spring-master.xml");
    }

    public void init() {
        _instance = new AppContext();
    }

    public AppContext getContext() {
        if (_instance == null) {
            synchronized (AppContext.class){
                if (_instance == null)
                    init();
            }
        }
        return _instance;
    }
}
