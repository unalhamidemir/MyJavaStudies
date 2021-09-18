package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.SystemPersonelService;
import kodlama.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/systempersonnel")
public class SystemPersonnelController {
	
	private SystemPersonelService systemPersonelService;
	
	@Autowired
	public SystemPersonnelController(SystemPersonelService systemPersonelService) {
		super();
		this.systemPersonelService = systemPersonelService;
	}
	
	@GetMapping("/getAll")
	public List<SystemPersonnel> getAll(){
		return this.systemPersonelService.getAll();
	}

}
