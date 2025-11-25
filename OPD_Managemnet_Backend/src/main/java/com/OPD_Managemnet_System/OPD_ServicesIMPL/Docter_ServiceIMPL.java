package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Docter;
import com.OPD_Managemnet_System.OPDRepo.Docter_Repo;
import com.OPD_Managemnet_System.OPDServices.Docter_Service;

@Service
public class Docter_ServiceIMPL implements Docter_Service {
	
	@Autowired
	private Docter_Repo docter_Repo;

	@Override
	public Docter save(Docter docter) {
		// TODO Auto-generated method stub
		return docter_Repo.save(docter);
	}

	@Override
	public List<Docter> ListofDocters() {
		// TODO Auto-generated method stub
		return docter_Repo.findAll();
	}

	@Override
	public Docter getBYID(int id) {
		// TODO Auto-generated method stub
		return docter_Repo.findById(id).orElse(null);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		docter_Repo.deleteById(id);
	}

}
