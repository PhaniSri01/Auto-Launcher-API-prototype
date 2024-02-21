package com.example.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Students.entity.Person;
import com.example.Students.service.PersonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Controller
@RequestMapping("/personal-data")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Operation(summary = "Fetches all the person data")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success"),
			@ApiResponse(responseCode = "401", description = "Unauthorised"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	@GetMapping("/all")
	public @ResponseBody Iterable<Person> getPerson() {
//		System.out.println("Response: "+studentService.getPerson());
		return personService.getPerson();
	}
	
	@Operation(summary = "Fetches all the person data by id")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Success"),
			@ApiResponse(responseCode = "401", description = "Unauthorised"),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	@GetMapping("/{id}")
	public @ResponseBody Person getPersonById(@PathVariable Long id) {
//		System.out.println("Response from service class: "+studentService.getPersonById(id));
		return personService.getPersonById(id);
	}

}
