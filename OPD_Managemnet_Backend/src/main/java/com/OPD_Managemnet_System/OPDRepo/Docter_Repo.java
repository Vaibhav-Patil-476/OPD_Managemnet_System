package com.OPD_Managemnet_System.OPDRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OPD_Managemnet_System.OPDEntitys.Docter;

@Repository
public interface Docter_Repo extends JpaRepository<Docter, Integer> {

}
