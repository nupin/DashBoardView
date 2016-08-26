package com.yodlee.dashboard.bugzilla.service;

import java.util.Date;
import java.util.List;

import com.yodlee.dashboard.integration.model.Bug;

public interface BugService {

	List<Bug> getAllClosedBugs(String customer , Date fromDate , Date toDate);
	
	List<Bug> getAllNewBugs(String customer , Date fromDate , Date toDate);
}
