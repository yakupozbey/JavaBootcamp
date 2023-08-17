package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		// Bu katman sadece ve sadece db: data base erişim kodları buraya yazılır.
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
