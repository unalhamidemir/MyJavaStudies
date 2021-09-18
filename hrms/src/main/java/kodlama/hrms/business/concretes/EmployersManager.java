package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.EmployersService;
import kodlama.hrms.dataAccess.abstracts.EmployersDao;
import kodlama.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{
	
	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public List<Employers> getAll() {
		return this.employersDao.findAll();
	}

}
