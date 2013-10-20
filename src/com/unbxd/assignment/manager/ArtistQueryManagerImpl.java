/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unbxd.assignment.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nityam
 */
public class ArtistQueryManagerImpl implements ArtistQueryManager
{
    private Map<String, List<String>> artistMap;

    public ArtistQueryManagerImpl()
    {
        artistMap = new HashMap<String, List<String>>();
    }
    public void addQueryToArtist(String artist, String query)
    {
        List<String> artistList;
        if(!artistMap.containsKey(artist))
        {
            artistList = new ArrayList<String>();
            artistMap.put(artist, artistList);
        }
        else
            artistList = artistMap.get(artist);
        artistList.add(query);
    }

    public List<String> getListOfQuery(String artist)
    {
        return artistMap.get(artist);
    }

}
