package com.unbxd.assignment.manager;

import java.util.List;

/**
 *
 * @author Nityam
 */
public interface ArtistQueryManager
{
    public void addQueryToArtist(String artist, String query);
    public List<String> getListOfQuery(String artist);
}
