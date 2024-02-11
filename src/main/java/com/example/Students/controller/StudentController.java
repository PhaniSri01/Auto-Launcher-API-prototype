package com.example.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.example.Students.entity.AggregateData;
import com.example.Students.entity.Marks;
import com.example.Students.entity.Person;
import com.example.Students.service.MarksService;
import com.example.Students.service.PersonService;

@Controller
@RequestMapping("/aggregate-data")
public class StudentController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private MarksService marksService;
	
	@Autowired
	private AggregateData aggregateData;
	
	
	
//	@GetMapping("/marks")
//	public @ResponseBody Iterable<Marks> getMarks(){
//		System.out.println("Response: "+studentService.getMarks());
//		return studentService.getMarks();
//	}
	
//	@SuppressWarnings("unchecked")
//	@GetMapping("/marks")
//	@ResponseBody
//	public ResponseEntity<Marks> getMarks(){
//		System.out.println("Response: "+studentService.getMarks());
//		Iterable<Marks> ml = studentService.getMarks();
//		return new ResponseEntity(ml, HttpStatus.OK);
//	}
	
//	@GetMapping("/marks/{roll}")
//	public Marks getMarksById(@PathVariable Long roll) {
//		System.out.println("Response from service class: "+studentService.getMarksById(roll));
//		return studentService.getMarksById(roll);
//	}
	
//	@GetMapping("/aggregate-data/{id}")
//	@ResponseBody
//	public AggregateData getAggregateData(@PathVariable Long id){
//		
//		Marks m = studentService.getMarksById(id);
//		Person p = studentService.getPersonById(id);
//		aggregateData.setMarks(m);
//		aggregateData.setPerson(p);
//		return aggregateData;
//	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public AggregateData getAggregateData(@PathVariable Long id){
		
//		Marks m = marksService.getMarksById(id);
//		Person p = personService.getPersonById(id);
		String urip = "http://localhost:8080/personal-data/"+String.valueOf(id);
		RestTemplate restTemplate = new RestTemplate();
		Person p = restTemplate.getForObject(urip, Person.class);
		String urim = "http://localhost:8080/marks-data/"+String.valueOf(id);
		Marks m = restTemplate.getForObject(urim, Marks.class);
		aggregateData.setMarks(m);
		aggregateData.setPerson(p);
		String uri = "http://localhost:8081/library-data/"+String.valueOf(id);
//		RestTemplate restTemplate = new RestTemplate();
		Object libraryData = restTemplate.getForObject(uri, Object.class);
		aggregateData.setObject(libraryData);
		return aggregateData;
	}
}
