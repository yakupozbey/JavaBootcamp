package methodOverloading;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

	// Yukarıdaki 2 farklı methodun ismi topla. Yani ikisinin ismi aynı
	// AMA birinde 2 tane diğerinde ise 3 tane veri istiyor. Buna Overloading denir

}
