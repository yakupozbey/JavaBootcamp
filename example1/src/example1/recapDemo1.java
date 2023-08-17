package example1;

public class recapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 28;
		int sayi2 = 25;
		int sayi3 = 24;
		
		int enBüyük = sayi1;
		
		if (enBüyük<sayi2) {
			enBüyük = sayi2;
		}
		else if (enBüyük<sayi3) {
			enBüyük = sayi3;
		}
		else {
			enBüyük = sayi1;
		}
		
		System.out.println("En büyük sayi : " + enBüyük);
	 
	}

}
