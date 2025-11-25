package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Test_Master;
import com.OPD_Managemnet_System.OPDRepo.Test_Master_Repo;
import com.OPD_Managemnet_System.OPDServices.Test_Master_Service;

@Service
public class Test_Master_ServiceIMPL implements Test_Master_Service{

	@Autowired
	private Test_Master_Repo master_Repo;
	
	@Override
	public Test_Master save(Test_Master test_Master) {
		// TODO Auto-generated method stub
		return master_Repo.save(test_Master);
	}

	@Override
	public List<Test_Master> ListofTest_Master() {
		// TODO Auto-generated method stub
		return master_Repo.findAll();
	}

	@Override
	public Test_Master getBYTest_MasterID(int id) {
		// TODO Auto-generated method stub
		return master_Repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		master_Repo.deleteById(id);
	}

}
