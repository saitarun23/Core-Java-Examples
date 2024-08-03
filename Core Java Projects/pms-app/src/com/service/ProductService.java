package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {
	
	private List<Product> listOfProduct=new ArrayList<Product>();
	
	public String addProduct(Product product) {
		int flag=0;
		if(listOfProduct.size()==0) {
		listOfProduct.add(product);
		return "Product added successfully";
		}else {
			Iterator<Product> li = listOfProduct.iterator();
			while(li.hasNext()) {
				Product p = li.next();
				if(p.getPid()==product.getPid()) {
					flag++;
					break;
				}
			}
		}
		if(flag>0) {
			return "Product id must be unique";
		}else {
			listOfProduct.add(product);
			flag=0;
			return "Product added successfully";
		}
		
	}
	
	public String deleteProduct(int pid) {
		return null;
		
	}
	
	public String updateProduct(Product product) {
		return null;
		
	}
	
	public List<Product> retrieveProduct() {
		return null;
		
	}
}
