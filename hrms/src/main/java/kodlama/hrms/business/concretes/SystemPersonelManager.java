package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.SystemPersonelService;
import kodlama.hrms.dataAccess.abstracts.SystemPersonnelDao;
import kodlama.hrms.entities.concretes.SystemPersonnel;

@Service
public class SystemPersonelManager implements SystemPersonelService{
	private SystemPersonnelDao systemPersonnelDao;
	
	
	@Autowired
	public SystemPersonelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}



	@Override
	public List<SystemPersonnel> getAll() {
		return this.systemPersonnelDao.findAll();
	}

}
