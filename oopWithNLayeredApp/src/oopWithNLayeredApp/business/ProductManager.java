package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	// private List<Logger> loggers;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// business rules: iş kuralları yazılır
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		/*
		 * JdbcProductDao productDao = new JdbcProductDao(); 
		 * productDao.add(product);
		 */

		/*
		 * ProductDao productDao = new HibernateProductDao(); 
		 * productDao.add(product);
		 * 
		 * Bir katman başka bir katmanın clasını kullanıyorken sadece INTERFACE' inden
		 * erişim kurmalıdır.
		 */

		productDao.add(product);
		
		for (Logger logger : loggers) { // [db, file, mail]
			logger.log(product.getName());
		}

	}

}
