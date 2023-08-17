package example2;

public class RecapDemo_Classes {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		int sonuc1 = dortIslem.topla(6, 2);
		int sonuc2 = dortIslem.cikar(6, 2);
		int sonuc3 = dortIslem.carp(6, 2);
		int sonuc4 = dortIslem.böl(6, 2);
		
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);

	}

}
