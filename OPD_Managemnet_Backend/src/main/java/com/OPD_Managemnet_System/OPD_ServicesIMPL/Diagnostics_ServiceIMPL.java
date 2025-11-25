package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Diagnostics;
import com.OPD_Managemnet_System.OPDRepo.Diagnostics_Repo;
import com.OPD_Managemnet_System.OPDServices.Diagnostics_Service;

@Service
public class Diagnostics_ServiceIMPL implements Diagnostics_Service {

	//Create Object of Diagnostics_Repo file
	@Autowired
	private Diagnostics_Repo diagnostics_Repo;
	
	//Implement Abstract Methods(Save , GetAll, GetById, and delete)
	@Override
	public Diagnostics saveDiagnostics(Diagnostics diagnostics) {
		// TODO Auto-generated method stub
		return diagnostics_Repo.save(diagnostics);
	}

	@Override
	public List<Diagnostics> getAllDiagnostics() {
		// TODO Auto-generated method stub
		return diagnostics_Repo.findAll();
	}

	@Override
	public Diagnostics getByDiagnosticsID(int id) {
		// TODO Auto-generated method stub
		return diagnostics_Repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		diagnostics_Repo.deleteById(id);
	}

}
