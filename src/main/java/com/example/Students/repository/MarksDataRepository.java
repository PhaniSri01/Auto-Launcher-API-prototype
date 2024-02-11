package com.example.Students.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Students.entity.Marks;

@Repository
public interface MarksDataRepository extends CrudRepository<Marks, Long>{

//	used in case of CRUD repository
	Iterable<Marks> findAll();
	
//	List<Marks> findAll();
	
//	used in case of CRUD repository
	Optional<Marks> findById(Long roll); 
	
//	Marks getReferenceById(Long id);
	
}
