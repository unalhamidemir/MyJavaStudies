package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel, Integer>{

}
