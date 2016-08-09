package com.yodlee.dashboard.integration.dao;

import java.util.List;

import com.yodlee.dashboard.integration.model.Bug;

public interface BugsDao {

	Bug findById(int bugId);
	
	List<Bug> findAllBugs();
}
