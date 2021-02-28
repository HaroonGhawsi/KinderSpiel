package de.kinderspiel.haroon;

import de.kinderspiel.haroon.service.KinderSpielService;
import de.kinderspiel.haroon.view.Spiel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SchereSteinPapierApplication {

	public static void main(String[] args) {

		Spiel spiel = new Spiel(new KinderSpielService());
		spiel.spielen();

	}

}
