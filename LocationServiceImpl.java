package com.locationweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb.enitity.Locations;
import com.locationweb.repository.LocationWebRepository;


@Service
public class LocationServiceImpl implements LocationService {
@Autowired
   private LocationWebRepository locationRepo;
	@Override
	public List<Locations> allLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveLocations(Locations location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLocation(long id) {
		// TODO Auto-generated method stub
		locationRepo.deleteById(id);
		
	}
	

}
