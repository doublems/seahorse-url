package org.doublem.seahorse.service.user;

import org.doublem.seahorse.model.user.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest()
public class UserFinderServiceTest {

    @Autowired
    private UserFinderService userFinderService;

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("Testing for DI by the spring-boot :: default")
    public void contextLoads() throws Exception {

        assertThat(userFinderService).isNotNull();
        assertThat(userRepository).isNotNull();
    }

    @Test
    public void searchPomosUser() throws Exception {

        userRepository.save(User.builder().build());
        User result = userFinderService.searchUser(1L);
        assertThat(result).isNotNull();
    }

}
