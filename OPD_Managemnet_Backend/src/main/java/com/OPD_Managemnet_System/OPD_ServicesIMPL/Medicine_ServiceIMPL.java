package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Medicine;
import com.OPD_Managemnet_System.OPDRepo.Medicine_Repo;
import com.OPD_Managemnet_System.OPDServices.Medicine_Service;

@Service
public class Medicine_ServiceIMPL implements Medicine_Service {

	@Autowired
	private Medicine_Repo medicine_Repo;
	
	@Override
	public Medicine save(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicine_Repo.save(medicine);
	}

	@Override
	public List<Medicine> GetAllMedicine() {
		// TODO Auto-generated method stub
		return medicine_Repo.findAll();
	}

	@Override
	public Medicine GetMedicineById(int id) {
		// TODO Auto-generated method stub
		return medicine_Repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		medicine_Repo.deleteById(id);
	}

}
