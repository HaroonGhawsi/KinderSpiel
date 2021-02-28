package de.kinderspiel.haroon.service;

import de.kinderspiel.haroon.bo.SpielAuswahl;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class KinderSpielService {

	private static final List<SpielAuswahl> SPIEL_AUSWAHL_LIST = Collections.unmodifiableList(Arrays.asList(SpielAuswahl.values()));
	private static final int SIZE = SPIEL_AUSWAHL_LIST.size();
	private static final Random RANDOM = new Random();


	public void spielStarten() {
		System.out.println("Spiel Starten...");
	}

	public String getSpieler1Eingabe() {
		return new Scanner(System.in).nextLine();
	}


	/**
	 * Generiert eine Zufall von die Spiel Auswahl liste
	 * Eine generierte Auswahl zurückgibt.
	 */

	public SpielAuswahl zufallgenerieren() {
		return SPIEL_AUSWAHL_LIST.get(RANDOM.nextInt(SIZE));
	}

	/**
	 * Prüft der Benutzer Auswahl Eingabe, ob von SpielAuswahl Enum ist.
	 * @return gibts zurück True/false
	 */

	public boolean checkBenutzerAuswahl(final String auswahl){

		List<String> spielAuswahlListAlsString = SPIEL_AUSWAHL_LIST.stream()
												 .map(Enum::name)
												 .collect(Collectors.toList());

		return spielAuswahlListAlsString.contains(auswahl);
	}

	/**
	 * Prüft die Benutzer Eingabe
	 * @return True/false
	 */

	public boolean isSpieler1EingabeValid(final String spieler1Eingabe) {

		if (spieler1Eingabe != null && !spieler1Eingabe.isEmpty() && this.checkBenutzerAuswahl(spieler1Eingabe.toUpperCase())) {
			System.out.println("Spieler 1::>> " + spieler1Eingabe.toUpperCase());
			return true;
		} else {
			System.out.println("Die Eingabe von Spieler 1 ist nicht erkennbar");
			return  false;
		}

	}

}
