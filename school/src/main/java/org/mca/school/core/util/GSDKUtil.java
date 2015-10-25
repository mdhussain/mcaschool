package org.mca.school.core.util;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

/**
 * Created by Hussain on 10/21/15.
 */
public class GSDKUtil {
    public static String GUEST_USER = "guest";

    public static String getLoggedInUser () {
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();
        String email = user.getEmail();
        return (email != null && !email.isEmpty())?email:GUEST_USER;
    }
}
