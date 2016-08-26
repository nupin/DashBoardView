package com.yodlee.dashboard.integration.dao;

import java.util.Date;
import java.util.List;

import com.yodlee.dashboard.integration.model.Bug;

public interface BugsDao {

	Bug findById(int bugId);
	
	List<Bug> findAllBugs();
	
	public List<Bug> getAllClosedBugs(String customer , Date fromDate , Date toDate );
	
	public List<Bug> getAllNewBugs(String customer , Date fromDate , Date toDate);
}
