package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.City;

public interface CityService {
	
	DataResult<List<City>> getAll();
	
	Result add(City city);
}
