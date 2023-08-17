package example1;

public class mükemmelSayi {

	public static void main(String[] args) {

		int number = 29;
		int i = 1;
		int remainder;
		int toplam = 0;

		for (i = 1; i < number; i++) {
			remainder = number % i;
			if (remainder == 0) {
				toplam = toplam + i;

			}
		}

		if (toplam == number) {
			System.out.println("Sayi mükemmel sayidir :" + number);
		} else {
			System.out.println("Sayi mükemmel sayi değildir :" + number);
		}

	}

}
