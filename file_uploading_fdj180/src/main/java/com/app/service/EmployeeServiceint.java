package com.app.service;

import org.springframework.web.multipart.MultipartFile;

public interface EmployeeServiceint{

	public void saveEmplyeeData(String json, MultipartFile pancard, MultipartFile aadharcard);

}
