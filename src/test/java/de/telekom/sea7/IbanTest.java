package de.telekom.sea7;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.telekom.sea7.Iban;

public class IbanTest {

	private Iban cut;

	@BeforeEach
	void setup() {
		cut = new Iban(null);
	}

	@Test
	void setIban_test() {
		// Arrange
		cut.setIban("DE213456789");

		// Act
		var result = cut.getIban();

		// Assert
		assertEquals("DE213456789", result);
	}

	@AfterEach
	void teardown() {
		cut = null;
	}
}
