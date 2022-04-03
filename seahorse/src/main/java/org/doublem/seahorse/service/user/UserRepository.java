package org.doublem.seahorse.service.user;

import org.doublem.seahorse.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findById(long id);
}
