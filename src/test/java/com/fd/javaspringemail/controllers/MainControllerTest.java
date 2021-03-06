package com.fd.javaspringemail.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class MainControllerTest {

    private MockMvc mvc;

    @BeforeEach
    void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new MainController()).build();
    }

    @Test
    void showHomePage() throws Exception {

        mvc.perform(get("/"))
                .andExpect(view().name("index"))
                .andExpect(forwardedUrl("index"))
                .andExpect(model().size(1))
                .andExpect(model().attributeExists("email"))
                .andExpect(status().isOk());
    }
}