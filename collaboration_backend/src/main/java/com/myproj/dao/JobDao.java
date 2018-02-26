package com.myproj.dao;

import java.util.List;

import com.myproj.model.Job;

public interface JobDao {
	void addJob(Job job);
	List<Job> getAllJobs();
	Job getJob(int id);

}