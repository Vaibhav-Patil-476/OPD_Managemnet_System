package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Pathology_Test;
import com.OPD_Managemnet_System.OPDRepo.Pathology_Test_Repo;
import com.OPD_Managemnet_System.OPDServices.Pathology_Test_Service;

@Service
public class Pathology_Test_ServiceIMPL implements Pathology_Test_Service{

	@Autowired
	private Pathology_Test_Repo pathology_Test_Repo;
	
	@Override
	public Pathology_Test save(Pathology_Test pathology_Test) {
		// TODO Auto-generated method stub
		return pathology_Test_Repo.save(pathology_Test);
	}

	@Override
	public List<Pathology_Test> getAllPathology_Tests() {
		// TODO Auto-generated method stub
		return pathology_Test_Repo.findAll();
	}

	@Override
	public Pathology_Test getPathology_TestById(int id) {
		// TODO Auto-generated method stub
		return pathology_Test_Repo.findById(id).orElse(null);
	}

	@Override
	public void DeletePathology_TestById(int id) {
		// TODO Auto-generated method stub
		pathology_Test_Repo.deleteById(id);
	}

}
