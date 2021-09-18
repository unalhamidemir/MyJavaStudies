package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.EmployersService;
import kodlama.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployersService employersService;
	
	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	@GetMapping("/getAll")
	public List<Employers> getAll(){
		return this.employersService.getAll();
	}
	

}
