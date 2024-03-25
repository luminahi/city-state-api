package com.luminahi.apicity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class CityStateApiApplicationTests {

    private MockMvc mockMvc;
    
    @Autowired
    public CityStateApiApplicationTests(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void testGetCity() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/cidades/{id}", 1))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
    
	@Test
	void contextLoads() {

	}
	
	@Test
	void testingEquals() {
	    assertEquals(1, 1);
	}
	
   @Test
    void testingFalse() {
       assertFalse(false);
    }

}
