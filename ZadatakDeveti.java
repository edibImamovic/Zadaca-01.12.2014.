/**
 * 
 * @author Edib Imamovic
 *
 */

public class zadatakDeveti {

	public static void main(String[] args) {
		System.out.println("Unesite neki znak");
		char unosZnaka = TextIO.getChar(); // unos znaka
		
		int asciiKod = (int) unosZnaka; // Konverzija char-a u ASCII 
		
		System.out.printf("Znak koji ima ASCII šifru %c je broj: %d ", unosZnaka, asciiKod);
		System.out.println("\nAscii znak koji slijedi uneseni znak je: " + (char)(asciiKod+1)); 
		System.out.println("Ascii znak koji prethodi unesenom znaku je: " + (char)(asciiKod-1));
		
	}	

}
