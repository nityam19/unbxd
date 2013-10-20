package com.unbxd.assignment.manager;

import com.unbxd.assignment.model.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nityam
 */
public class ProductManagerImpl implements ProductManager
{
    private Map<Integer, Product> productMap;

    public ProductManagerImpl()
    {
        productMap = new HashMap<Integer, Product>();
    }

    public Map<Integer, Product> getProductMap()
    {
        return productMap;
    }

    public void setProductMap(Map<Integer, Product> productMap)
    {
        this.productMap = productMap;
    }

    public void addProduct(Product product)
    {
        productMap.put(product.getProductId(), product);
    }

    public Product getProduct(int productId)
    {
        return productMap.get(productId);
    }

}
