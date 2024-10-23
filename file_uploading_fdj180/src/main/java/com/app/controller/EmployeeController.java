package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.service.EmployeeServiceint;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceint esi;
	
	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestPart("info") String json,
			                                   @RequestPart("pan") MultipartFile pancard,
			                                  @RequestPart("aadhar") MultipartFile aadharcard)
	{
		
		esi.saveEmplyeeData(json,pancard,aadharcard);
		
//		System.out.println(json);
//		System.out.println(pancard);
//		System.out.println(aadharcard);
		
		return new ResponseEntity<String>("Data Saved", HttpStatus.OK);
	}
	
	
	

}
