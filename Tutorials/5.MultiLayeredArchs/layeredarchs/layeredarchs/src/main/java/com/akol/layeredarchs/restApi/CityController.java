package com.akol.layeredarchs.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akol.layeredarchs.Entities.City;
import com.akol.layeredarchs.Business.ICityService;

@RestController // to denote it is a RestAPI controller
@RequestMapping("/api") // all operations are starting with api, this is world-wide standard
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities") // localhost/api/cities
	public List<City> get() {
		return cityService.getAll();
	}
	
}
