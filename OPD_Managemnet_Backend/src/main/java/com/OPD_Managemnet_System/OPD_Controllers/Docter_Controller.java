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
import com.OPD_Managemnet_System.OPDServices.Docter_Service;
import com.OPD_Managemnet_System.OPD_DTOs.Docter_DTO;

@RequestMapping("OPD/Docter")
@RestController
public class Docter_Controller {

	@Autowired
	private Docter_Service docter_Service;
	
	@PostMapping("/")
	public ResponseEntity<Docter> SaveDocter(@RequestBody Docter_DTO docter_DTO){
		
		Docter docter = new Docter();
		
		docter.setName(docter_DTO.getName());
		docter.setMobileno(docter_DTO.getMobileno());
		docter.setAddress(docter_DTO.getAddress());
		docter.setPassword(docter_DTO.getPassword());
		docter.setClinic_name(docter_DTO.getClinic_name());
		docter.setSpecialization(docter_DTO.getSpecialization());
		docter.setToken(docter_DTO.getToken());
		docter.setStatus(docter_DTO.getStatus());
		docter.setCreated_at(docter_DTO.getCreated_at());
		docter.setUpdated_at(docter_DTO.getUpdated_at());
		
		Docter saveDocter=docter_Service.save(docter);
		
		return new ResponseEntity<>(saveDocter,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Docter>> GetAllDocter(){
		
		List<Docter> docter=docter_Service.ListofDocters();
		if(docter==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}return new ResponseEntity<>(docter,HttpStatus.FOUND);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Docter> GetByDocterID(@PathVariable("id") int id){
		Docter docter=docter_Service.getBYID(id);
		if(docter==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}return new ResponseEntity<>(docter,HttpStatus.FOUND);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Docter> UpdateDocterRecord(@PathVariable("id") int id, @RequestBody Docter_DTO docter_DTO){
		
		Docter docter =docter_Service.getBYID(id);
		if(docter==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		docter.setName(docter_DTO.getName());
		docter.setMobileno(docter_DTO.getMobileno());
		docter.setAddress(docter_DTO.getAddress());
		docter.setPassword(docter_DTO.getPassword());
		docter.setClinic_name(docter_DTO.getClinic_name());
		docter.setSpecialization(docter_DTO.getSpecialization());
		docter.setToken(docter_DTO.getToken());
		docter.setStatus(docter_DTO.getStatus());
		docter.setCreated_at(docter_DTO.getCreated_at());
		docter.setUpdated_at(docter_DTO.getUpdated_at());
		
		Docter saveDocter =docter_Service.save(docter);
		
		return new ResponseEntity<>(saveDocter,HttpStatus.FOUND);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> DeleteDocter(@PathVariable("id") int id){
		
		Docter docter=docter_Service.getBYID(id);
		if(docter==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}docter_Service.delete(id);
		return new ResponseEntity<>(HttpStatus.MOVED_PERMANENTLY);
	}
}
