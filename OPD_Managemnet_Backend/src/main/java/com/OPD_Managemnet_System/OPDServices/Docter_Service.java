package com.OPD_Managemnet_System.OPDServices;

import java.util.List;

import com.OPD_Managemnet_System.OPDEntitys.Docter;


public interface Docter_Service {

	Docter save(Docter docter);
	
	List<Docter> ListofDocters();
	
	Docter getBYID(int id);
	
	void delete (int id);
}
