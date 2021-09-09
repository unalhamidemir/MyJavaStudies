package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.setProductDao(productDao);
		this.loggerService = loggerService;
	}
	
	


	public LoggerService getLoggerService() {
		return loggerService;
	}




	public void setLoggerService(LoggerService loggerService) {
		this.loggerService = loggerService;
	}




	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
		return;	
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n Eklendi.." +product.getName());
	}
	

	@Override
	public void update(Product product) {
		if(product.getCategoryId()<10) {
			System.out.println("Kategoride �r�n G�ncellendi..");
			return;
		}
		this.productDao.update(product);
	}

	@Override
	public void delete(Product product) {
		if(product.getCategoryId()>10) {
			System.out.println("Kategoride �r�n Silindi..");
			return;
		}this.productDao.delete(product);
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public ProductDao getProductDao() {
		return productDao;
	}


	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
