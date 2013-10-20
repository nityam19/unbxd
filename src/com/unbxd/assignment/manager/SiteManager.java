package com.unbxd.assignment.manager;

import com.unbxd.assignment.exception.InvalidQueryException;
import com.unbxd.assignment.model.Product;
import com.unbxd.assignment.model.SearchQuery;
import java.util.List;

/**
 *
 * @author Nityam
 */
public interface SiteManager
{
    public void addProduct(Product product);
    public void addQuery(SearchQuery query) throws InvalidQueryException;
    public List<Product> getAllProductsForQuery(String query);
    public List<String> getAllQueryForArtist(String artist);
}
