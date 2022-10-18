package com.akol.layeredarchs.Business;

import java.util.List;

import com.akol.layeredarchs.Entities.City;

public interface ICityService {
	
	/* This interface contains the same signatures of ICityDal.java */
	/* We create this interface rather than using ICityDal interface */
	/* Because we will use this to manage if we may need to add more parameters*/
	/* to control the work-rules. */
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
}
