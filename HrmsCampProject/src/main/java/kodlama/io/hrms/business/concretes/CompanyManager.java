package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CompanyService;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CompanyDao;
import kodlama.io.hrms.entities.Company;

@Service
public class CompanyManager implements CompanyService {
	
	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}


	@Override
	public Result add(Company company) {
		if(this.companyDao.existsCompanyByName(company.getName())) {
		return new ErrorResult("Bu Şirket Kaydı Mevcut..");
	}
		this.companyDao.save(company);
		return new SuccessResult("Şirket Kaydedildi..");
	}
}
