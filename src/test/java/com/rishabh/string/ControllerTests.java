package com.rishabh.string;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(Controller.class)
public class ControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReverse() throws Exception {
        String text = "hello";
        String expectedReversedText = "olleh";

        this.mockMvc
                .perform(get("/api/v1/reverse")
                        .param("text", text))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedReversedText));
    }

    @Test
    public void testIsPalindrome_True() throws Exception {
        String text = "madam";
        Boolean expectedIsPalindrome = true;


        this.mockMvc
                .perform(get("/api/v1/isPalindrome")
                        .param("text", text))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedIsPalindrome.toString()));
    }

    @Test
    public void testIsPalindrome_False() throws Exception {

        String text = "hello";
        Boolean expectedIsPalindrome = false;

        this.mockMvc
                .perform(get("/api/v1/isPalindrome")
                        .param("text", text))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedIsPalindrome.toString()));
    }
}
