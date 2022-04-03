package org.doublem.seahorse.service.user;

import lombok.AllArgsConstructor;
import org.doublem.seahorse.model.user.User;
import org.springframework.stereotype.Service;

/**
 * UserFinderService is aimed to search user of the pomos
 */
@Service
@AllArgsConstructor
public class UserFinderService {

    UserRepository userRepository;

    public User searchUser(Long id) {

        return userRepository.findById(id).orElseGet(() -> null);
    }

}
