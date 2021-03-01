package de.kinderspiel.haroon.service;

import de.kinderspiel.haroon.bo.SpielAuswahl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;


@SpringBootTest
class KinderSpielServiceTest {

	@Autowired
	private KinderSpielService kinderSpielService;

	@Test
	void zufallgenerieren() {

		// Test data
		List<SpielAuswahl> spielAuswahls = Collections.unmodifiableList(Arrays.asList(SpielAuswahl.values()));

		// Method in Test
		SpielAuswahl result = this.kinderSpielService.zufallgenerieren();

		// Result
		assertNotEquals(null, result.name());
		assertTrue(spielAuswahls.contains(result));

	}
}
