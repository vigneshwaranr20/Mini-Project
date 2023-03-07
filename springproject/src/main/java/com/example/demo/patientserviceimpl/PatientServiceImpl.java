package com.example.demo.patientserviceimpl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	
	private PatientRepository patientRepository;
	
	
	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}

}







