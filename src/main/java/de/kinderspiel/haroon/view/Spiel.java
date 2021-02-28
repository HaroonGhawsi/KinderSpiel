package de.kinderspiel.haroon.view;

import de.kinderspiel.haroon.bo.SpielAuswahl;
import de.kinderspiel.haroon.service.KinderSpielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Spiel {

	private KinderSpielService service;

	@Autowired
	public Spiel(KinderSpielService kinderSpielService) {
		this.service = kinderSpielService;
	}

	public void spielen() {

		this.service.spielStarten();
		String spieler1Eingabe = this.service.getSpieler1Eingabe();
		boolean isEingabeValid = this.service.isSpieler1EingabeValid(spieler1Eingabe);
		if (isEingabeValid) {
			this.gegenSpielerAuswahlAnzeigen(this.service.zufallgenerieren());
		}
	}

	private void gegenSpielerAuswahlAnzeigen(final SpielAuswahl auswahl){

		switch (auswahl) {
			case SCHERE:
				System.out.println("Spieler 2::>> " + SpielAuswahl.SCHERE.name());
				break;
			case STEIN:
				System.out.println("Spieler 2::>> " + SpielAuswahl.STEIN.name());
				break;
			case PAPIER:
				System.out.println("Spieler 2::>> " + SpielAuswahl.PAPIER.name());
				break;
			default:
				System.out.println("Spieler 2 hat keine auswahl");
		}
	}
}
