package prodapp_project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import prodapp_project.dto.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

//	@Transactional
//	public void updateProduct(Product product) {
//		this.hibernateTemplate.update(product);
//	}
	
	// Read All
	public List<Product> getAllProducts() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	// Delete
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}

	// Read One
//	public Product getSingleProduct(int pid) {
//		return hibernateTemplate.load(Product.class, pid);
//	}
	
	public Product getSingleProduct(int pid) {
		return hibernateTemplate.get(Product.class, pid);
	}
	
}
