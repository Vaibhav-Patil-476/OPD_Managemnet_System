package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Visit;
import com.OPD_Managemnet_System.OPDRepo.Visit_repo;
import com.OPD_Managemnet_System.OPDServices.Visit_Service;

@Service
public class Visit_ServiceIMPL implements Visit_Service {

	@Autowired
	private Visit_repo visit_repo;
	
	@Override
	public Visit save(Visit visit) {
		// TODO Auto-generated method stub
		return visit_repo.save(visit);
	}

	@Override
	public List<Visit> getAll() {
		// TODO Auto-generated method stub
		return visit_repo.findAll();
	}

	@Override
	public Visit getBYID(int id) {
		// TODO Auto-generated method stub
		return visit_repo.findById(id).orElse(null);
	}

	@Override
	public void deleteBYID(int id) {
		// TODO Auto-generated method stub
		visit_repo.deleteById(id);
	}

}
