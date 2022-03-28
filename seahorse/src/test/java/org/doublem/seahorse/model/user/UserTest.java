package org.doublem.seahorse.model.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserTest {

    @Test
    public void searchPomosUser() throws Exception {
        User mock = User.builder().build();
        assertThat(mock).isNotNull();
    }

}
