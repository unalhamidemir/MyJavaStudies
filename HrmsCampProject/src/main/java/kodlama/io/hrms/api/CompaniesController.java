package kodlama.io.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.CompanyService;
import kodlama.io.hrms.core.utilities.Result;
import kodlama.io.hrms.entities.Company;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	
	private CompanyService companyService;
	
	@Autowired
	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody Company company) {
		return this.companyService.add(company);
	}
	

}
