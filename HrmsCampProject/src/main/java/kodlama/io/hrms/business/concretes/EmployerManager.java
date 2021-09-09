package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlama.io.hrms.core.verifications.abstracts.EmployeeConfirmService;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;

import kodlama.io.hrms.entities.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Autowired(required = false)
	private EmailVerificationService emailVerificationService;
	
	@Autowired(required = false)
	private EmployeeConfirmService employeeConfirmService;
	
	
	
	
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş Verenler Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if(employer.getCompanyName() == null || employer.getWebAddress() == null ||
				employer.getPasswordAgain() == null || employer.getType() == null) {
			return new ErrorResult("Tüm Alanlar Zorunlu..");
		
		}else if (!employer.getPassword().equals(employer.getPasswordAgain())) {
			return new ErrorResult("Şifre ve Şifre Tekrarı Aynı Değil..");
		
		}else if(!doEmailAndWebSiteHaveTheSameDomain(employer.getEmail(), employer.getWebAddress())) {
			return new ErrorResult("Email web Site ile Aynı Domaine Sahip Değil...");
		
		}else if(!this.emailVerificationService.isVerified(employer.getEmail())) {
			return new ErrorResult("Email Onaylanmadı..");
		
		}else if (!this.employeeConfirmService.isConfirmEmployee(employer)) {
			return new ErrorResult("Sistem Personeli Onaylamadı...");
		
		}else if (this.employerDao.existsEmployerByEmail(employer.getEmail())) {
			return new ErrorResult("Email Adresi Mevcut..");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("İş Veren Eklendi...");
	}

	@Override
	public boolean doEmailAndWebSiteHaveTheSameDomain(String email, String website) {
		int index = email.indexOf("@");
		String emailDomain = email.substring(index);
		String webSiteDomain = website.replaceFirst("^(https?://)?(www\\.)?", "");
		if(emailDomain.contains(webSiteDomain)) {
			return true;
		}else {
		
			return false;
	}
	
}
}