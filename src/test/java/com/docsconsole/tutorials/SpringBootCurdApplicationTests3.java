package com.docsconsole.tutorials;

import com.docsconsole.tutorials.resource.MailController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MailController.class)
public class SpringBootCurdApplicationTests3 {

    /*@Autowired
    private MockMvc mockMvc;

    @Test
    public void testWeb_WhenSuccessIsResult() throws Exception {
        this.mockMvc.perform(get("/curd-app/api/testWeb")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Result: Success")));
    }

    @Test
    public void givenProducts_whenGetProducts_thenReturnJsonArray() throws Exception {
        mockMvc.perform(get("/curd-app/api/products").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
        //.andExpect(content().json(productServiceImpl.getAllProducts().toString()));
    }*/

}


