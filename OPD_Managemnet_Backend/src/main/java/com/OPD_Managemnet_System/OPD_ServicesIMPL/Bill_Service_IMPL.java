package com.OPD_Managemnet_System.OPD_ServicesIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OPD_Managemnet_System.OPDEntitys.Bill;
import com.OPD_Managemnet_System.OPDRepo.Bill_Repo;
import com.OPD_Managemnet_System.OPDServices.Bill_Service;

@Service
public class Bill_Service_IMPL implements Bill_Service {

	
	@Autowired
	private Bill_Repo bill_Repo;
	@Override
	public Bill save(Bill bill) {
		// TODO Auto-generated method stub
		return bill_Repo.save(bill);
	}

	@Override
	public List<Bill> GetallBill() {
		// TODO Auto-generated method stub
		return bill_Repo.findAll();
	}

	@Override
	public Bill GetBillById(int id) {
		// TODO Auto-generated method stub
		return bill_Repo.findById(id).orElse(null);
	}

	@Override
	public void deleteBillById(int id) {
		// TODO Auto-generated method stub
		bill_Repo.deleteById(id);
	}

}
