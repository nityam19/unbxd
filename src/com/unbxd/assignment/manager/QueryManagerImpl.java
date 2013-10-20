package com.unbxd.assignment.manager;

import com.unbxd.assignment.model.SearchQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nityam
 */
public class QueryManagerImpl implements QueryManager
{
    private Map<String, List<Integer>> queryMap;

    public QueryManagerImpl()
    {
        queryMap = new HashMap<String, List<Integer>>();
    }

    @Override
    public void addQuery(SearchQuery query)
    {
        int productId = query.getProductId();
        String searchQuery = query.getQuery();
        List<Integer> productIdList;
        if(!queryMap.containsKey(searchQuery))
        {
            productIdList = new ArrayList<Integer>();
            queryMap.put(searchQuery, productIdList);
        }
        else
            productIdList = queryMap.get(searchQuery);
        productIdList.add(productId);
    }

    @Override
    public List<Integer> getProductList(String query)
    {
        return queryMap.get(query);
    }

    public Map<String, List<Integer>> getQueryMap()
    {
        return queryMap;
    }

    public void setQueryMap(Map<String, List<Integer>> queryMap)
    {
        this.queryMap = queryMap;
    }
}
