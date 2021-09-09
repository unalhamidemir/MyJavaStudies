package kodlama.io.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilities.DataResult;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAllActives(){
		return this.jobAdvertisementService.getAllActives();
	}
	
	@GetMapping("/getAllActives")
	public DataResult<List<JobAdvertisement>> getAllSortedDate(){
		return this.jobAdvertisementService.getAllSortedData();
	}
	
	@GetMapping("/getAllActiveAndByCompany")
	public DataResult<List<JobAdvertisement>>getAllActivesAndByCompany(String companyName){
		return this.jobAdvertisementService.getAllActiveAndByCompany(companyName);
	}
	
	@PutMapping("/setStatus/{id}")
	public Result setJobAdvertisementStatus(@PathVariable int id) {
		return this.jobAdvertisementService.setJobAdvertisementStatus(id);
	}














}
