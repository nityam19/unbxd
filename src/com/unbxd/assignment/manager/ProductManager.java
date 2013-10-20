package com.unbxd.assignment.manager;

import com.unbxd.assignment.model.Product;

/**
 *
 * @author Nityam
 */

public interface ProductManager
{
    public void addProduct(Product product);
    public Product getProduct(int productId);
}
