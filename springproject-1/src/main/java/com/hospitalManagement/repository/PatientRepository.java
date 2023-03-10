package com.hospitalManagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.entity.DoctorEntity;
import com.hospitalManagement.entity.HistoryEntity;
public interface PatientRepository extends JpaRepository<HistoryEntity ,Integer> {
	
	

}