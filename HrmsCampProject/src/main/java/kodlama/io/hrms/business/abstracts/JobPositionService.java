package kodlama.io.hrms.business.abstracts;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.JobPosition;

import java.util.List;

import kodlama.io.hrms.core.utilities.DataResult;

public interface JobPositionService {
	
	DataResult<List< JobPosition>> getAll();
	
	Result add(JobPosition jobPosition);
	
	
	

}
