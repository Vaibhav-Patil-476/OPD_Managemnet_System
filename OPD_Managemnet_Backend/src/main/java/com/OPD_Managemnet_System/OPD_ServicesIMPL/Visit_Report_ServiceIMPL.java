package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Visit_Report;
import com.OPD_Managemnet_System.OPDRepo.Visit_Report_Repo;
import com.OPD_Managemnet_System.OPDServices.Visit_Report_Service;

@Service
public class Visit_Report_ServiceIMPL implements Visit_Report_Service {

	@Autowired
	private Visit_Report_Repo visit_Report_Repo;
	
	@Override
	public Visit_Report save(Visit_Report visit_report) {
		// TODO Auto-generated method stub
		return visit_Report_Repo.save(visit_report);
	}

	@Override
	public List<Visit_Report> GetAllVisit_Report() {
		// TODO Auto-generated method stub
		return visit_Report_Repo.findAll();
	}

	@Override
	public Visit_Report GetAllVisit_ReportByid(int id) {
		// TODO Auto-generated method stub
		return visit_Report_Repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		visit_Report_Repo.deleteById(id);
	}

}
