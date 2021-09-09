package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.ErrorResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlama.io.hrms.core.verifications.abstracts.MernisVerificationService;
import kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.hrms.entities.Candidate;
@Service


public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	
	@Autowired(required = false)
	private EmailVerificationService emailVerificationService;
	
	@Autowired(required = false)
	private MernisVerificationService mernisVerificationService;

	
	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Adaylar Listelendi..");
	}

	@Override
	public Result add(Candidate candidate) {
		if(candidate.getEmail()== null || candidate.getPasswordAgain()== null || candidate.getPasswordAgain()== null ||
				candidate.getType() == null || candidate.getFirstName()== null || candidate.getLastName() == null ||
				candidate.getNationalIdentity()== null || candidate.getDateOfBirth()== null) {
			return new ErrorResult("Tüm Alanlar Zorunludur...");
		}else if (!candidate.getPasswordAgain().equals(candidate.getPasswordAgain())) {
			return new ErrorResult("Şifre ve Şifre Tekrarı Aynı Değil...");
		}else if (!this.emailVerificationService.isVerified(candidate.getEmail())) {
			return new ErrorResult("Email Onaylanmadı..");
		}else if(!this.mernisVerificationService.chechIfRealPerson(candidate)) {
			return new ErrorResult("Kullanıcı Mernis Doğrulanmadı...");
		}else if (this.candidateDao.existsCandidateByEmail(candidate.getEmail())) {
			return new ErrorResult("Email Kaydı Mevcut..");
		}else if (this.candidateDao.existsCandidateByNationalIdentity(candidate.getNationalIdentity())) {
			return new ErrorResult("Tc kimlik no Zaten Kayıtlı..");
		}
		this.candidateDao.save(candidate);
		
		return new SuccessResult("Aday Eklendi..");
	}
	

}
