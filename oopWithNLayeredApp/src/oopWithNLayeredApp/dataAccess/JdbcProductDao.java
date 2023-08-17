package oopWithNLayeredApp.dataAccess;

// Bir pakette başka bir paketi kullannak istiyorsanız kullanmak istediğiniz paketi import etmeniz gerekir.
import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		// Bu katman sadece ve sadece db: data base erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
