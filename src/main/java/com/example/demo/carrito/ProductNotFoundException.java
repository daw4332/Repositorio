package com.example.demo.carrito;

/**
 * Exception thrown when a product is not found in a shopping cart.
 */
 
public class ProductNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a ProductNotFoundException.
	 */
	public ProductNotFoundException() {
		super();
	}
}