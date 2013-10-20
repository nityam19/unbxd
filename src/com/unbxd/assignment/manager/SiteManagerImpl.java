package com.unbxd.assignment.manager;

import com.unbxd.assignment.exception.InvalidQueryException;
import com.unbxd.assignment.model.Product;
import com.unbxd.assignment.model.SearchQuery;
import java.util.ArrayList;
import java.util.List;
import javax.management.Query;

/**
 *
 * @author Nityam
 */
public class SiteManagerImpl implements SiteManager
{
    private ProductManager productManager;
    private QueryManager queryManager;
    private ArtistQueryManager artistManager;

    public void addProduct(Product product)
    {
        productManager.addProduct(product);
    }

    public void addQuery(SearchQuery query) throws InvalidQueryException
    {
        Product product = productManager.getProduct(query.getProductId());
        if(product != null)
        {
            artistManager.addQueryToArtist(product.getArtist(), query.getQuery());
            queryManager.addQuery(query);
        }
        else
            throw new InvalidQueryException();
    }

    public List<Product> getAllProductsForQuery(String query)
    {
        List<Integer> productIdList = queryManager.getProductList(query);
        List<Product> productList = new ArrayList<Product>();
        for(int i : productIdList)
        {
            Product product = productManager.getProduct(i);
            if(product != null)
                productList.add(product);
        }
        return productList;
    }

    public List<String> getAllQueryForArtist(String artist)
    {
        return artistManager.getListOfQuery(artist);
    }

    public ArtistQueryManager getArtistManager()
    {
        return artistManager;
    }

    public void setArtistManager(ArtistQueryManager artistManager)
    {
        this.artistManager = artistManager;
    }

    public ProductManager getProductManager()
    {
        return productManager;
    }

    public void setProductManager(ProductManager productManager)
    {
        this.productManager = productManager;
    }

    public QueryManager getQueryManager()
    {
        return queryManager;
    }

    public void setQueryManager(QueryManager queryManager)
    {
        this.queryManager = queryManager;
    }
}
