package com.yodlee.dashboard.bugzilla.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yodlee.dashboard.bugzilla.service.BugService;
import com.yodlee.dashboard.integration.dao.BugsDao;
import com.yodlee.dashboard.integration.model.Bug;

@Service("bugService")
@Transactional
public class BugServiceImpl implements BugService {

	@Autowired
	private BugsDao bugDao ;
	
	public List<Bug> getAllClosedBugs(String customer , Date fromDate , Date toDate) {
		
		return bugDao.getAllClosedBugs(customer, fromDate, toDate);
	}

	public List<Bug> getAllNewBugs(String customer , Date fromDate , Date toDate) {
		
		return bugDao.getAllNewBugs(customer, fromDate, toDate);
	}
}
