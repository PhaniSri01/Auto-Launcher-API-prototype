package com.example.Students.repository;

import java.util.List;
import java.util.Optional;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Students.entity.Marks;
import com.example.Students.entity.Person;

@Repository
public interface PersonalDataRepository extends CrudRepository<Person, Long>{

//	used in case of CRUD repository
	Iterable<Person> findAll();
	
//	used in case of CRUD repository
//	@Query(value = "select p from person p where p.rollno = 1")
	Optional<Person> findById(Long roll);
	
//	List<Person> findAll();
	
//	Person getReferenceById(Long id);
}
