package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CityService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CityDao;
import kodlama.io.hrms.entities.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;
	
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	
	
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Data Listelendi..");
	}

	@Override
	public Result add(City city) {
		if(this.cityDao.existsCityByName(city.getName())) {
			return new ErrorResult("Bu Şehir Zaten Kayıtlı");
		}
		this.cityDao.save(city);
		return new SuccessResult("Şehir Kaydedildi...");
	}

}
