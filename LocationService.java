package com.locationweb.services;

import java.util.List;


import com.locationweb.enitity.Locations;


public interface LocationService {


	public List<Locations> allLocations();


	public void saveLocations(Locations location);




	public void deleteLocation(long id);

}
