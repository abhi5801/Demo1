package com.app.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeService implements EmployeeServiceint {
	
	@Autowired
	EmployeeRepository er;

	@Override
	public void saveEmplyeeData(String json, MultipartFile pancard, MultipartFile aadharcard) {
		
	    ObjectMapper om = new ObjectMapper();
	    
	    Employee emp = null;
	      
	   
	    try {
			emp = om.readValue(json,Employee.class );
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
	    
	   if(emp != null)
	   {
		   try {
				emp.setAadharcard(aadharcard.getBytes());
				emp.setPancard(pancard.getBytes());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	   }
	   
	   er.save(emp);
	    
		
	}

}
