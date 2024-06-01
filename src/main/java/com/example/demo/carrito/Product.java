package com.example.demo.carrito;

/**
 * An example product for use in the example shopping cart.
 */
 
public class Product {

	private String title;
	private double price;

	/**
	 * Constructs a Product.
	 * @param title Product title.
	 * @param price Product price.
	 */
	public Product(String title, double price) {
		this.title = title;
		this.price = price;
	}

	/**
	 * Returns the product title.
	 * @return Title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the product price.
	 * @return Price.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Tests product equality.
	 * @return true if the products
	 *         are equal.
	 */
	public boolean equals(Object o) {
	
		if (o instanceof Product) {
			Product p = (Product)o;
			return p.getTitle().equals(title);
		}

		return false;
	}
}
