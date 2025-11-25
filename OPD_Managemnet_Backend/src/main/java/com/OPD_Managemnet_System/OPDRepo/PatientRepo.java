package com.OPD_Managemnet_System.OPDRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OPD_Managemnet_System.OPDEntitys.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
