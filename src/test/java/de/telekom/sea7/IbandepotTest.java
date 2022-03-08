package de.telekom.sea7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IbandepotTest {

	private IbanDepot cut;

	@BeforeEach
	void setup() {
		cut = new IbanDepot();
	}

	@Test
	void addIban_test(Iban iban) {
		// Arrange
		iban = new Iban("DE214567");

		// Act
		cut.add(iban);

		// Assert
		assertEquals("DE214567", cut.get(0));
	}

	@AfterEach
	void teardown() {
		cut = null;
	}
}
