package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getAllActives();
	
	DataResult<List<JobAdvertisement>> getAllSortedData();
	
	DataResult<List<JobAdvertisement>> getAllActiveAndByCompany(String companyName);
	
	Result setJobAdvertisementStatus(int id);
	
	

}
