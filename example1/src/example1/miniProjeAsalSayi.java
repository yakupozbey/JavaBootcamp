package example1;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		
		//bug: mantıksal hata. Böcek
		int number = -2;
		int i = 2;
		int remainder = number % i;
		
		boolean isPrime = true;
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
		}
		
		if (number == 1) {
			System.out.println("Sayi asal değildir");
			return;
		}
		
		for(i=2; i<number; i++) {
			if(number % i ==0) {
				isPrime = false;
			}
		}
		
		if(isPrime == true) {
			System.out.println("Sayi asaldir");
		}else {
			System.out.println("Sayi asal değildir");
		}

	}

}
