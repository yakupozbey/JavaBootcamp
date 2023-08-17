package example1;

public class sayıBulma {

	public static void main(String[] args) {

		int[] sayılar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		/*
		for (int i = 0; i < 5; i++) {
			if (sayılar[i] == aranacak) {
				System.out.println(aranacak + " " + "Sayılar dizisi içerisinde bulundu");
			} else if (sayılar[i] != aranacak){
				System.out.println(aranacak + " " + "Sayılar dizisi içerisinde bulunamadı");
			}
		}*/
		
		for (int sayi : sayılar) {
			if (aranacak==sayi) {
				varMi = true;
				break;
			}
		}
		
		if (varMi==true) {
			System.out.println(aranacak + " : " + "Sayılar dizisi içerisinde bulundu");
		}else {
			System.out.println(aranacak + " : " + "Sayılar dizisi içerisinde bulunmadı");
		}

	}

}
