package com.yodlee.dashboard.presentation.configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	final String originalDate = "yyyy-MM-dd";
	final String targetlDate = "yyyy-MM-dd HH:mm:ss.SSS";
//	
	
	@RequestMapping(value = "/bugs/", method = RequestMethod.GET)
    public ResponseEntity<List<Bug>> listAllClosedBugs() {
		
        List<Bug> bugs = bugService.getAllClosedBugs("", getDate("2016-08-21"), getDate("2016-08-22"));
        System.out.println("----"+bugs.size());
        if(bugs.isEmpty()){
            return new ResponseEntity<List<Bug>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Bug>>(bugs, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/newbugs/", method = RequestMethod.GET)
    public ResponseEntity<List<Bug>> listAllNewBugs() {
		
        List<Bug> bugs = bugService.getAllNewBugs("", getDate("2016-04-11"), getDate("2016-04-12"));
        System.out.println("----"+bugs.size());
        if(bugs.isEmpty()){
            return new ResponseEntity<List<Bug>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Bug>>(bugs, HttpStatus.OK);
    }
	
	private Date getDate(String dateString){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(originalDate);
		SimpleDateFormat targetDateFormat = new SimpleDateFormat(targetlDate);
		try{
			return targetDateFormat.parse(targetDateFormat.format(dateFormat.parse(dateString)));		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
