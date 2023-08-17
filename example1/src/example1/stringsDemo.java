package example1;

public class stringsDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"));
		
		//System.out.println(mesaj); Bİr üstteki birleştirme olan concat bir değişkene atanırsa sonucunu verdiği veri çıktısını verir. Bunu dışında ise mesaj değişkeni için atana değer ne ise çıktıda o çıkar.
		
		//Alttaki kodun çıktısı mesaj olan String ifademiz B ile başlıyorsa TRUE döndürür. Değilse FALSE döndürür.
		System.out.println(mesaj.startsWith("b"));
		//endsWith ise sorduğun karakter mesaj stringinin son anahtarımı dır. Bunu s
		System.out.println(mesaj.endsWith("."));
		
		char [] karakterler = new char [5];
		mesaj.getChars (0,5,karakterler,0);
		System.out.println(karakterler);
		
		
		//Sık kullanılan bir fonksiyondur. String olan mesaj ifadesindeki
		//'a' karakteri(ifadesi) kacıncı eleman olduğunu bulmayı arar.
		//İlk bulduğunu verir. Sonraki a ları vermez.
		System.out.println(mesaj.indexOf('a'));
		//String olarak bir metni de arayabilirsin
		System.out.println(mesaj.indexOf("av"));
		
		//Aramaya sağdan başlar. Yani mesaj daki ifade için aramaya baştan başlar ama aradağın char veya String ifadenin en sonuncusunun sırasını verir
		System.out.println(mesaj.lastIndexOf('a'));
		*/
		
		//replace değiştirmek istediğin karakterleri değiştirmen için kullanılır
		//Bu çıkan sonuc mesaj'a atanmaz. Yeni bir değişkene atayarak tekrardan kullanabilirsin.
		
		//String fonksiyonların hemen hemen tamamı mesajın yani ifadenin kendisini değiştirmez. Çıkan çıktıyı yeni biir değişkene atayabiliriz
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj);
		
		
		System.out.println(yeniMesaj);
		//substring fonksiyonu string ifadeyi kesmeye yarar.
		//mesaj.substring(2) 2. ci indexten itibaren al ve çıktı ver demek.
		//mesaj.substring(2,4) ifadesi ise 2. itibaren
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		
		
		//split("a") fonksiyonu a index'inde böler.Ve de her bir bölümü array olarak algılar. Çıktıyı aşşağıdaki ifade gibi çıkartır
		for (String kelime : mesaj.split("a")) {
			System.out.println(kelime);
			
		}
		
		//toLowerCase fonksiyonu bütün ifadeyi küçük harfe çevirir.
		System.out.println(mesaj.toLowerCase());
		
		//toUpperCase fonksiyonu ifadenin tüm harflerini BÜYÜK harfe cevirir.
		System.out.println(mesaj.toUpperCase());
			
		//trim() fonksiyonu değişkendeki ifadenin başında ve sonundaki boşlukları keser.
		String mesajIki = "    Bugün hava çok güzel.    ";
		System.out.println(mesajIki);
		System.out.println(mesajIki.trim());
		

	}

}
