package example2;

public class Classes {

	public static void main(String[] args) {

		// Clas'lar referance type'dır
		// Bir alttaki customerManager'a customerManager2'yi atadık.
		// Yani Clases sınıfında tanımlamamıza gerek kalmadı. 
		// new kullanmak pahalıdır(gereksiz kullanmamak gerekir)
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		//value type. int, String gibi veri tipleri için geçerlidir
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		
		
		//Dİziler referance type' dır
		int [] sayilar1 = new int [] {1,2,3};
		int [] sayilar2 = new int [] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}

}
