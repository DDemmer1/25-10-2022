package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {

//		System.out.println("Hello World");
//		
//		addieren(5, 8);
//
//		int ergebnisMulti = multiply(2, 5);
//
//		System.out.println(ergebnisMulti+ " (aus der main-methode)");
		

		Rechenhilfe rHilfe = new Rechenhilfe();
		rHilfe.addieren(7,7);
		
	}
	
	

	static void addieren(int zahl1, int zahl2) {

		// STRG * 7 => zeile als Kommentar
		// System.out.println(zahl1+zahl2);

		int ergebnis = zahl1 + zahl2;

		// sysout + STRG + LEER = System.out.println()
		System.out.println(ergebnis);
	}
	
	
	
	static int multiply(int zahl1, int zahl2) {
			
//		return zahl1*zahl2;
		int ergebnis = zahl1*zahl2;
		System.out.println(ergebnis + " (aus der Methode mit return)");
		
		return ergebnis;
	}
	
	
}
