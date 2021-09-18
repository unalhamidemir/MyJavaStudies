package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.JobSeekerService;
import kodlama.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerController {
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getAll")
	public List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}
}
