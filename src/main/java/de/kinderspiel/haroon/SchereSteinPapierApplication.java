package de.kinderspiel.haroon;

import de.kinderspiel.haroon.view.Spiel;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SchereSteinPapierApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(SchereSteinPapierApplication.class);
		Spiel spiel = appContext.getBean(Spiel.class);
		spiel.spielen();
	}

}
