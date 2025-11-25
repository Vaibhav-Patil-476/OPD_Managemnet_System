package com.OPD_Managemnet_System.OPDServices;

import java.util.List;

import com.OPD_Managemnet_System.OPDEntitys.Patient;

public interface Patient_Service {

	Patient save(Patient patient);
	
	List<Patient> getAll();
	
	Patient getBYID(int id);
	
	void delete (int id);
}
