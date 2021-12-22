package com.psl.training.EASMProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psl.training.EASMProject.Entity.AdminDetails;

@Repository
public interface AdminRepository extends CrudRepository<AdminDetails, Integer>{
	//public boolean findByAdminId(int id);
	public boolean existsByPassword(String password);
}
