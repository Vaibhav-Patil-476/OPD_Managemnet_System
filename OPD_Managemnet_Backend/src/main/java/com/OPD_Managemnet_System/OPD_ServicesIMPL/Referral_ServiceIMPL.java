package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Referral;
import com.OPD_Managemnet_System.OPDRepo.Referral_Repo;
import com.OPD_Managemnet_System.OPDServices.Referral_Service;

@Service
public class Referral_ServiceIMPL implements Referral_Service{

	@Autowired
	private Referral_Repo referral_Repo;
	@Override
	public Referral save(Referral referral) {
		// TODO Auto-generated method stub
		return referral_Repo.save(referral);
	}

	@Override
	public List<Referral> getAllReferral() {
		// TODO Auto-generated method stub
		return referral_Repo.findAll();
	}

	@Override
	public Referral GetReferralById(int id) {
		// TODO Auto-generated method stub
		return referral_Repo.findById(id).orElse(null);
	}


	@Override
	public void deleteReferralById(int id) {
		// TODO Auto-generated method stub
		referral_Repo.deleteById(id);
	}

	

}
