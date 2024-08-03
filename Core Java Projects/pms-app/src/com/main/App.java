package com.main;

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
			System.out.println("1:Add Product");
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
