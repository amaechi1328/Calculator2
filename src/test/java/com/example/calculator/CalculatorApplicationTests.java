package com.example.calculator;

import com.example.calculator.Service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {
	private final CalculatorService cakculator = new CalculatorService();

	@Test
	public void testSum(){
		assertEquals(5, cakculator.sum(2, 3));
	}
}
