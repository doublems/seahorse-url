package org.doublem.seahorse.service.user;

import org.doublem.seahorse.model.user.User;
import org.springframework.stereotype.Service;

/**
 * UserFinderService is aimed to search user of the pomos
 */
@Service
public class UserFinderService {

    public User searchUser(String uuid){
        return User.builder().build();
    }


}
