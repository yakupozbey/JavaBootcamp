package classsesWİthAttributes;

public class ProductManager {

	public void Add(Product product) {
		// JDBC : kodları ile veri tabanına yazıcaz. İleride..

		System.out.println("Ürün eklendi :" + product.getName());

	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price) {
		
	}

}
