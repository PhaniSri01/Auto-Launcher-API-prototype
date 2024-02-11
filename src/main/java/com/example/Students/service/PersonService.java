package com.example.Students.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Students.entity.Person;
import com.example.Students.repository.PersonalDataRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonalDataRepository personalDataRepository;
	
	public Iterable<Person> getPerson(){
//		System.out.println("Inside service class: "+ personRepo.findAll());
//		System.out.println("Response in service:" + personalDataRepository.findAll());
		return personalDataRepository.findAll();
//		return null;
	}
	
	public Person getPersonById(Long roll) {
		Optional<Person> pd = personalDataRepository.findById(roll);
//		System.out.println("Repo response: "+pd.get().getName());
//		System.out.println(pd.isPresent());
		Person res = null;
		if(pd.isPresent()) {
			res = pd.get();
		}
//		System.out.println(pd.get());
		return res;
	}

}
