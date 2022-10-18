package com.akol.layeredarchs.DataAccess;
import java.util.List;

import com.akol.layeredarchs.Entities.City;

public interface ICityDal {

	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	
}