package com.unbxd.assignment.manager;

import com.unbxd.assignment.model.SearchQuery;
import java.util.List;

/**
 *
 * @author Nityam
 */
interface QueryManager
{
    public void addQuery(SearchQuery query);
    public List<Integer> getProductList(String query);
}
