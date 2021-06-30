package fr.eql.al35.iservice;

import java.util.List;

import fr.eql.al35.entity.Product;
import fr.eql.al35.entity.ProductType;

public interface ProductIService {

	List<Product> displayAllProducts();
	List<Product> displayAvailableProducts();
	Product displayProductById(int id);
	List<ProductType> displayAllCategories();
	List<Product> displayByProductType(ProductType productType);
	Product upDate(Integer id, Product product);
	void setDeleteProduct(Integer id);
	void setUndeleteProduct(Integer id);
	Product addProduct(Product product);

}
