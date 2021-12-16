package com.psl.training.EASMProject.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.training.EASMProject.Entity.Employee_score;
import com.psl.training.EASMProject.Repository.CourseRepository;


@Service
public class scoreService {
	
	@Autowired
	private CourseRepository repo;
	
	public scoreService() {}
	
	public scoreService(CourseRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void savescore(Employee_score Employee_score) {
		repo.save(Employee_score);
	}
	
	public Iterable<Employee_score> showscore(){
		return repo.findAll();
	}
	
	public void updateScore(Employee_score Employee_score) {
		repo.save(Employee_score);
	}
	

}
