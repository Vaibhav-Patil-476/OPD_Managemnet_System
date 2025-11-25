package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Patient;
import com.OPD_Managemnet_System.OPDRepo.PatientRepo;
import com.OPD_Managemnet_System.OPDServices.Patient_Service;

@Service
public class Patient_ServiceIMPL implements Patient_Service {

	@Autowired
	private PatientRepo patientRepo;
	@Override
	public Patient save(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepo.save(patient);
	}

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Patient getBYID(int id) {
		// TODO Auto-generated method stub
		return patientRepo.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(id);
	}

}
