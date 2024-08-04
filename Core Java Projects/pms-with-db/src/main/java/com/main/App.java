package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();

		int choice;
		int pid;
		String pname;
		float price;
		String con;
		String result;

		do {
			System.out.println(
					"1 : Add Product 2 : Delete Product 3 : Update Product Price 4 : Find Product price by id 5 : View all products");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Plz enter the product id");
				pid = sc.nextInt();
				System.out.println("Plz enter the product name");
				pname = sc.next();
				System.out.println("Plz enter the product price");
				price = sc.nextFloat();
				Product p = new Product(pid, pname, price);
				result = ps.addProduct(p);
				System.out.println(result);
				break;

			case 2:
				System.out.println("Plz enter the product id to delete");
				pid = sc.nextInt();
				result = ps.deleteProduct(pid);
				System.out.println(result);
				break;

			case 3:
				System.out.println("Plz enter the product id to update the price");
				pid = sc.nextInt();
				System.out.println("Plz enter the new product price");
				price = sc.nextFloat();
				Product p1 = new Product();
				p1.setPid(pid);
				p1.setPrice(price);
				result = ps.updateProduct(p1);
				System.out.println(result);
				break;

			case 4:
				System.out.println("Plz enter the product id to find the price");
				pid = sc.nextInt();
				result = ps.findPriceById(pid);
				System.out.println(result);
				break;

			case 5:
				System.out.println("All Product info");
				List<Product> listOfProducts = ps.retrieveProduct();
				for (Product product : listOfProducts) {
					// System.out.println("Pid "+product.getPid()+" PName "+product.getPname()+"Price "+product.getPrice());
					System.out.println(product);
				}
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
	}
}