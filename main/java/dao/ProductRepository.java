package dao;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
	private List<Product> listOfProduct = new ArrayList<>();

	public ProductRepository() {
		listOfProduct.add(new Product("p001", "Iphone", 1000000, "the new Iphone", "Apple", "SmartPhone", 100, "NEW"));
		listOfProduct.add(new Product("p002", "Galaxy", 900000, "the new Galaxy", "Samsung", "SmartPhone", 200, "NEW"));
		listOfProduct.add(new Product("p003", "LG Gram", 1500000, "the new Laptop", "LG", "Laptop", 500, "NEW"));
	}

	// 전체상품 조회
	public List<Product> getAllProducts() {
		return listOfProduct;
	}

	// 상품 아이디로 조회
	public Product getProductById(String productId) {
		for (Product p : listOfProduct) {
			if (p.getProductId().equals(productId)) {
				return p;
			}
		}
		return null;
	}
}
