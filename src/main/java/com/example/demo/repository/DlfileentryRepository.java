package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Dlfileentry;

public interface DlfileentryRepository extends JpaRepository<Dlfileentry, Long>{
	
	
	List<Dlfileentry>	findByFolderid(long folderid);

}
