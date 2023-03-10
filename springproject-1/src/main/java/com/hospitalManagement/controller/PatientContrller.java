package com.hospitalManagement.controller;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hospitalManagement.serviceimpl.PatientServiceImpl;
 
@Controller
public class PatientContrller {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientContrller.class);
	
	@Autowired
	PatientServiceImpl patientService;
	
	
	@PostMapping("/sample")
	@ResponseBody
	public String sampleMethod() {
		logger.info("Sample Method");
		return "String";
	}
	
	@GetMapping("/patients")
	public String listUsers(Model model) {
		model.addAttribute("patients",patientService.getAllPatients());
		return "patients";
	}
	
	
	@PostMapping("/doctor")
	@ResponseBody
	public String patient()
	{
	logger.info("output");
	Map<String, Object> history= patientService.getAllPatients();
	//logger.info("output"+prod);
	String data = new Gson().toJson(history);
	//logger.info("output"+data);
	return data;
	}
}