package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.enitity.Locations;
import com.locationweb.services.LocationService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;

	@RequestMapping("/")
	public String viewLocationPage() {
		return "location";
	}

	@RequestMapping("/saveLocation")
	 public String saveOneLocation(@ModelAttribute("location") Locations location,ModelMap model)
	 {
	 locationService.saveLocations(location);
	 model.addAttribute("msg","Location is saved!!");
     return "location";
	 }

	//@RequestMapping("/saveLocation")
	//public String saveOneLocation(@RequestParam("id") long id, @RequestParam("codes") String code,
	//		@RequestParam("name") String name, @RequestParam("type") String type) {
	//	Locations location=new Locations();
	//	location.setId(id);
	//	location.setCodes(code);
	//	location.setName(name);
	//	location.setType(type);
		
	//	locationService.saveLocation(location);
	//	return "location";

		
		
	//}
	
	//@RequestMapping(value="/saveLocation", method=RequestMethod.POST)
	//public String saveOneLocation(LocationData locationData, Model model) {
	//	Locations location=new Locations();
	//	location.setId(locationData.getId());
	//	location.setCodes(locationData.getCodes());
		//location.setName(locationData.getName());
	//	location.setType(locationData.getType());
	//	locationService.saveLocation(location);
	//	model.addAttribute("msg", "Location is saved");
	//	return "location";
	//}
	
	
	
	@RequestMapping("/list")
	public String listAllLocations(ModelMap modelMap) {
		List<Locations> locations = locationService.allLocations();
	modelMap.addAttribute("locations", locations);
	return "listLocations";
	}
	
	@RequestMapping("/delete")
	public String deleteLocationById(@RequestParam("id")long id) {
		locationService.deleteLocation(id);
		return "redirect:/listLocations";
	}
}
