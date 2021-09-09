package kodlama.io.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.core.utilities.SuccessDataResult;
import kodlama.io.hrms.core.utilities.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.io.hrms.entities.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İlan Kaydedildi..");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult
				<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),
						"Data Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActives() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao
				.queryJobAdvertisementByStatusTrue(),"Aktif İş ilanları Listelendi..");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedData() {
		List<JobAdvertisement> jobAdvertisements = jobAdvertisementDao.findAll(Sort.by(Sort.Direction.DESC,"createDate"));
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisements,"İş İlanları Tarihe Göre Sıralandı...");
		
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveAndByCompany(String companyName) {
		List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.getCompany_Name(companyName);
		List<JobAdvertisement> jobAdvertisementActives = new ArrayList<JobAdvertisement>();
		for(JobAdvertisement jobAdvertisement : jobAdvertisements) {
			if(jobAdvertisement.isStatus()) {
				jobAdvertisementActives.add(jobAdvertisement);
			}
		}
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementActives,
				"Şirkete Ait Aktif İş İlanları Listelendi..");
	}

	@Override
	public Result setJobAdvertisementStatus(int id) {
		JobAdvertisement jobAdvertisement = this.jobAdvertisementDao.getById(id);
		jobAdvertisement.setStatus(false);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Sonlanddırıldı...");
	}

}
