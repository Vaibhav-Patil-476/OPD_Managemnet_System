package com.OPD_Managemnet_System.OPD_Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OPD_Managemnet_System.OPDEntitys.Docter;
import com.OPD_Managemnet_System.OPDEntitys.Referral_Center;
import com.OPD_Managemnet_System.OPDServices.Docter_Service;
import com.OPD_Managemnet_System.OPDServices.Referral_Center_Service;
import com.OPD_Managemnet_System.OPD_DTOs.Medicine_DTO;
import com.OPD_Managemnet_System.OPD_DTOs.Referral_Center_DTO;

@RestController
@RequestMapping("/Referral_Center")
public class Referral_Center_Controller {

	@Autowired
	private Referral_Center_Service referral_Center_Service;
	
	@Autowired
	private Docter_Service docter_Service;
	
	@PostMapping("/")
	private ResponseEntity<Referral_Center> SaveReferral_Center(@RequestBody Referral_Center_DTO referral_Center_DTO){
		Referral_Center referral_Center = new Referral_Center();
		
		referral_Center.setName(referral_Center_DTO.getName());
		referral_Center.setType(referral_Center_DTO.getType());
		referral_Center.setAddress(referral_Center_DTO.getAddress());
		referral_Center.setContact_info(referral_Center_DTO.getContact_info());
		referral_Center.setCreated_at(referral_Center_DTO.getCreated_at());
		
		
		Docter docter=docter_Service.getBYID(referral_Center_DTO.getDocterid());
		referral_Center.setDocterid(docter);
		
		Referral_Center SaveReferral_Center=referral_Center_Service.save(referral_Center);
		return new ResponseEntity<>(SaveReferral_Center,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	private ResponseEntity<List<Referral_Center>> GetAllReferral_Center(){
		List<Referral_Center> referral_Center = referral_Center_Service.GetAllMedicine();
		if(referral_Center==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}return new ResponseEntity<>(referral_Center,HttpStatus.FOUND);
		
	}
	@GetMapping("/{id}")
	private ResponseEntity<Referral_Center> GetReferral_CenterById(@PathVariable("id") int id, @RequestBody Medicine_DTO medicine_DTO){
		Referral_Center referral_Center = referral_Center_Service.GetReferral_CenterById(id);
		if(referral_Center==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}return new ResponseEntity<>(referral_Center,HttpStatus.FOUND);
	}
		
	
	@PutMapping("/{id}")
	private ResponseEntity<Referral_Center> UpdateReferral_CenterById(@PathVariable("id") int id,@RequestBody Referral_Center_DTO referral_Center_DTO){
		Referral_Center referral_Center = referral_Center_Service.GetReferral_CenterById(id);
	if(referral_Center==null) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	referral_Center.setName(referral_Center_DTO.getName());
	referral_Center.setType(referral_Center_DTO.getType());
	referral_Center.setAddress(referral_Center_DTO.getAddress());
	referral_Center.setContact_info(referral_Center_DTO.getContact_info());
	referral_Center.setCreated_at(referral_Center_DTO.getCreated_at());
	
	
	Docter docter=docter_Service.getBYID(referral_Center_DTO.getDocterid());
	referral_Center.setDocterid(docter);
	
	Referral_Center SaveReferral_Center=referral_Center_Service.save(referral_Center);
	return new ResponseEntity<>(SaveReferral_Center,HttpStatus.CREATED);
	
}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Referral_Center> DeleteReferral_CenterById(@PathVariable("id") int id, @RequestBody Medicine_DTO medicine_DTO){
		Referral_Center referral_Center = referral_Center_Service.GetReferral_CenterById(id);
		if(referral_Center==null) {
		 new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}referral_Center_Service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.MOVED_PERMANENTLY);
	}
}
