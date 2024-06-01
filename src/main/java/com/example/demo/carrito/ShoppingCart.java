package com.example.demo.carrito;

import java.util.*;

/**
 * An example shopping cart. 
 */
 
public class ShoppingCart {

    private ArrayList<Product> items;

    /**
     * Constructs a ShoppingCart instance.
     */
    public ShoppingCart() {
        items = new ArrayList<Product>();
    }

    /**
     * Returns the balance.
     * @return Balance.
     */
    public double getBalance() {
        Iterator<Product> i = items.iterator();
        double balance = 0.00;
        while (i.hasNext()) {
            Product p = (Product)i.next();
            balance = balance + p.getPrice();
        }

        return balance;
    }
    
    /**
     * Adds the specified product.
     * @param p Product.
     */
    public void addItem(Product p) {
        items.add(p);
    }

    /**
     * Removes the specified product.
     * @param p Product.
     * @throws ProductNotFoundException If the product does not exist.
     */
    public void removeItem(Product p) throws ProductNotFoundException {
        if (!items.remove(p)) {
            throw new ProductNotFoundException();
        }
    }

    /**
     * Returns the number of items in the cart.
     * @return Item count.
     */
    public int getItemCount() {
        return items.size();
    }
    
    /**
     * Empties the cart.
     */
    public void empty() {
        items = new ArrayList<Product>();
    }

    /**
     * Indicates whether the cart is empty.
     * @return true if the cart is empty;
     *     false otherwise.
     */
    public boolean isEmpty() {
        return (items.size() == 0);
    }
}