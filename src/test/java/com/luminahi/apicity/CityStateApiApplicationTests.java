package com.luminahi.apicity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CityStateApiApplicationTests {

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
