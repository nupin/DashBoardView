package com.yodlee.dashboard.presentation.configuration;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yodlee.dashboard.bugzilla.service.BugService;
import com.yodlee.dashboard.integration.model.Bug;

@RestController
public class DashBoardRestController {

	@Autowired
	BugService bugService ;
	
	@RequestMapping(value = "/bugs/", method = RequestMethod.GET)
    public ResponseEntity<List<Bug>> listAllUsers() {
        List<Bug> bugs = bugService.getAllClosedBugs("", new Date(), new Date());
        if(bugs.isEmpty()){
            return new ResponseEntity<List<Bug>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Bug>>(bugs, HttpStatus.OK);
    }
}
