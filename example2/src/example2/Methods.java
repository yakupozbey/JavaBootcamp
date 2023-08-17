package example2;

public class Methods {

	public static void main(String[] args) {

		// Bir methodu çağırmak için o methodun ismini yazmak gerekir
		// sayıBulmaca();
		sayıBulmaca();

	}

	// Altta sayıBulmaca adında bir method tanımlandı
	public static void sayıBulmaca() {

		int[] sayılar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayılar) {
			if (aranacak == sayi) {
				varMi = true;
				break;
			}
		}

		String mesaj ="";
		if (varMi == true) {
			mesaj = "Sayılar dizisi içerisinde bulundu" + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer(aranacak + " : " + "Sayılar dizisi içerisinde bulunmadı");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
