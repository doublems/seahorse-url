package org.doublem.seahorse.controller.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.doublem.seahorse.model.user.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class UserFinderControllerTest {

    @Autowired
    private UserFinderController userFinderController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Testing for DI by the spring-boot :: default")
    public void contextLoads() throws Exception {

        assertThat(userFinderController).isNotNull();
    }

    @Test
    @DisplayName("getUser :: default")
    public void getUser() throws Exception {

        // {"id":null,"displayId":null,"email":null}
        String expected = new ObjectMapper().writeValueAsString(User.builder().build());

        mockMvc.perform(
                        get("/users/1")
                                .accept(MediaType.APPLICATION_JSON)
                                .content(""))
                .andExpect(status().isOk())
                .andExpect(content().string(expected))
                .andDo(print());
    }
}
