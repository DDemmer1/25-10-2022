package de.demmer.dennis;

public class Rechenhilfe {
	
	
	void addieren(int zahl1, int zahl2) {

		// STRG * 7 => zeile als Kommentar
		// System.out.println(zahl1+zahl2);

		int ergebnis = zahl1 + zahl2;

		// sysout + STRG + LEER = System.out.println()
		System.out.println(ergebnis);
	}
	
	
	int multiply(int zahl1, int zahl2) {
		
//		return zahl1*zahl2;
		int ergebnis = zahl1*zahl2;
		System.out.println(ergebnis + " (aus der Methode mit return)");
		
		Hund h = new Hund();
		h.bellen();
		
		
		return ergebnis;
	}
	
	
	
	
}
