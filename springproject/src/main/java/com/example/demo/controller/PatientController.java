package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PatientService;
 
@Controller
public class PatientController {
	
	private PatientService patientService;
	
	@GetMapping("/")
	public String dummy() {
		return "Hiii";
	}
	public PatientController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	
	@GetMapping("/patients")
	public String listUsers(Model model) {
		model.addAttribute("patients",patientService.getAllPatients());
		return "patients";
	}
}