/**
 * 
 * @author Edib Imamovic
 *
 */
public class zadatakOsmi {

	public static void main(String[] args) {

		System.out.println("Unesite neki broj");
		int unosBroja = TextIO.getInt(); // unos broja
		char asciiKod = (char) unosBroja; // Konverzija int u char

		System.out.printf("Znak koji ima ASCII šifru %d je znak: %c ",
				unosBroja, asciiKod);

	}

}
