
public class vjezbaNiz1 {

	public static void main(String[] args) {
		
		
		System.out.println("unesite duzinu niza");
		int brojClanova = TextIO.getInt();
		
		int [] mojNekiNiz = new int [brojClanova];

		mojNekiNiz = funkcija(brojClanova);
		System.out.printf("Drugi clan niza je: %d\n", mojNekiNiz[1]);
		
		int sumaSumaaaa = funkcijaIspis(mojNekiNiz);
		System.out.printf("Suma je %d", sumaSumaaaa);
		
		if(fcijaNeparni(mojNekiNiz)==true)
			System.out.println("neparan je!");
		fcijaParni(mojNekiNiz);
	}

	private static boolean fcijaNeparni(int[] mojNekiNiz) {
		System.out.println("Neparni brojevi su:");
		for (int i=0; i<mojNekiNiz.length; i++){
			if (mojNekiNiz[i] %2!=0)
				return true;
			
		}
		System.out.println();
		return false;
}
	private static void fcijaParni(int[] mojNekiNiz) {
		System.out.println("Parni brojevi su:");
		for (int i=0; i<mojNekiNiz.length; i++){
			if (mojNekiNiz[i] %2==0){
				System.out.printf("%d ", mojNekiNiz[i]);
			}
		}
}
