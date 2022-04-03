package org.doublem.seahorse.controller.user;

import lombok.AllArgsConstructor;
import org.doublem.seahorse.model.user.User;
import org.doublem.seahorse.service.user.UserFinderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserFinderController {

    private UserFinderService userFinderService;

    @GetMapping("users/{id}")
    User getUser(@PathVariable("id") String id){
        return userFinderService.searchUser(Long.parseLong(id));
    }
}
