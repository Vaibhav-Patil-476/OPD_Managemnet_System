package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Referral_Center;
import com.OPD_Managemnet_System.OPDRepo.Referral_Center_Repo;
import com.OPD_Managemnet_System.OPDServices.Referral_Center_Service;

@Service
public class Referral_Center_ServiceIMPL implements Referral_Center_Service{

	@Autowired
	private Referral_Center_Repo referral_Center_Repo;
	@Override
	public Referral_Center save(Referral_Center referral_Center) {
		// TODO Auto-generated method stub
		return referral_Center_Repo.save(referral_Center);
	}

	@Override
	public List<Referral_Center> GetAllMedicine() {
		// TODO Auto-generated method stub
		return referral_Center_Repo.findAll();
	}

	@Override
	public Referral_Center GetReferral_CenterById(int id) {
		// TODO Auto-generated method stub
		return referral_Center_Repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		referral_Center_Repo.deleteById(id);
	}

}
