package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	private List<Product> listOfProduct = new ArrayList<Product>();
	ProductDao pd=new ProductDao();

	public String addProduct(Product product) {
		
		if(product.getPrice()<1000) {
			return "Price must be > 1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product didn't store";
		}
		
	}

	public String deleteProduct(int pid) {
		
		if(pd.deleteProduct(pid)>0) {
			return "Product record deleted successfully";
		}else {
			return "Product not present";
		}
	}

	public String updateProduct(Product product) {
		
		if(pd.updateProduct(product)>0) {
			return "Product price updated successfully";
		}else {
			return "Product not present";
		}
	}

	public String findPriceById(int pid) {
		int flag = 0;

		Iterator<Product> li = listOfProduct.iterator();
		while (li.hasNext()) {
			Product p = li.next();
			if (p.getPid() == pid) {
				flag++;
				return "Your product price is " + p.getPrice();
			}
		}

		if (flag == 0) {
			return "Product not preset";
		}
		return null;
	}

	public List<Product> retrieveProduct() {
		return listOfProduct;
	}
}