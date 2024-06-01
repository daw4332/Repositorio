package com.example.demo.carrito;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCarTest {
	
	private ShoppingCart cart;
	private Product product;
	
	@BeforeEach
	public void setUp() {
		cart = new ShoppingCart();
		product = new Product("cocacola", 1);
		cart.addItem(product);
		product = new Product("fanta", 1);
		cart.addItem(product);
	}
	
	@Test
	public void addItemTest(){
		Product p = new Product("item", 2);
	    cart.addItem(p);
	    //System.out.print(cart.getItemCount());
		assertEquals(3, cart.getItemCount());
	}
	
	@Test
	public void getBalanceTest1() {
		assertEquals(2, cart.getBalance());
	}
	
	@Test
	public void getBalanceTest2() {
		assertNotNull(cart.getBalance());
	}
	
	@Test
	public void removeItemTestNoExist() throws ProductNotFoundException {
		Product p = new Product("alvaro", 0.1);
		assertThrows(ProductNotFoundException.class, ()->cart.removeItem(p));
	}
	
	@Test
	public void removeItemTestExist() throws ProductNotFoundException {
		Product p = new Product("cocacola", 1);
		assertDoesNotThrow(()->cart.removeItem(p));
	}
	
	@Test
	public void emptyTest(){
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}
	
	@Test 
	public void isNotEmptyTest() {
		assertFalse(cart.isEmpty());
	}
	
	@Test 
	public void isEmptyTest() {
		cart.empty();
		assertTrue(cart.isEmpty());
	}




}
