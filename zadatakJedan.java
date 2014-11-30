/**
 * 
 * @author Edib Imamovic 30.11.2014.
 *
 */

public class zadatakJedan {
	
	public static void main(String[] args) {
	
		int suma = funkcijaSuma(); // funkcijaSuma poziva vrijednost sume. 
		System.out.println("Suma cifre koju ste unijeli je:" + suma); // Ispis sume  
	}

	public static int funkcijaSuma() {
	
		System.out.println("Unesite cijeli broj"); 
		int cijeliBroj = TextIO.getInt(); // unos sume

		int suma = 0;
		for (int i=0; i<=cijeliBroj; i++){ 
			suma = suma +i;
		}	
	return suma;
	}

}
