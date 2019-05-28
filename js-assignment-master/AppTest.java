package com.ibm.training.firstmavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {

	@BeforeEach
	void beforeAll() {
		System.out.println("this works before all");
	}

	@Test
	@Disabled
	void test() {

		App app = new App();

		int expected = 50;
		int actual = 10;

		assertEquals(expected, app.add(25, 250));

	}

	@Test
	void test2() {
		App app = new App();

		int expected = 1000;
		assertEquals(expected, app.add(250, 750));

	}
}
