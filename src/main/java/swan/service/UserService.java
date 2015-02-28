package swan.service;

import swan.domain.User;

public class UserService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }
}
