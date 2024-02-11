package com.example.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Students.entity.Person;
import com.example.Students.service.PersonService;

@Controller
@RequestMapping("/personal-data")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Person> getPerson() {
//		System.out.println("Response: "+studentService.getPerson());
		return personService.getPerson();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Person getPersonById(@PathVariable Long id) {
//		System.out.println("Response from service class: "+studentService.getPersonById(id));
		return personService.getPersonById(id);
	}

}
