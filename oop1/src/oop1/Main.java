package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		// Burada Product clasımın ismi, product1 ise değişkenim. Yani ürünüm.
		// Class tanımlaması aşşağıdaki gibi yapılı.
		Product product1 = new Product();
		// set value: Alttaki işlemin ismi. Yani deper atamak
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		// get: Okumak
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		
		CorpoırateCustomer corporateCustomer = new CorpoırateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("0533333");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("11111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer [] customers = {individualCustomer, corporateCustomer};

	}

}
