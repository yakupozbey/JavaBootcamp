package example2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		mesaj.substring(0, 2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayı = topla(5, 7);
		System.out.println(sayı);

	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void güncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;

	}

	public static String sehirVer() {
		return "Ankara";

	}

}
