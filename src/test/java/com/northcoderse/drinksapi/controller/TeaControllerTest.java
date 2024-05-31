package com.northcoderse.drinksapi.controller;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class TeaControllerTest {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetTeaLover() throws Exception {

        String expectedContent = "I love tea";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/tealover"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));

    }

    @Test
    public void testGetTea() throws Exception {

        String expectedName = "tea";
        boolean expectedHasMilk = true;
        int expectedSugar = 2;

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/tea")
                                .param("name", "tea")
                                .param("hasMilk", "true")
                                .param("sugar", "2"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.hasMilk").value(expectedHasMilk))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedName))
                .andExpect(MockMvcResultMatchers.jsonPath("$.sugar").value(expectedSugar));

    }


}
